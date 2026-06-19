package com.mjc813.jwtsecurity_login.model.member;

import com.mjc813.jwtsecurity_login.common.Mjc813Exception;
import com.mjc813.jwtsecurity_login.common.Util;
import com.mjc813.jwtsecurity_login.role.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService implements UserDetailsService {
	@Autowired
	private MemberJpaRepository memberJpaRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;

	public MemberDto insert(MemberDto memberDto, boolean bAdminMode) {
		MemberEntity memberEntity = (MemberEntity)new MemberEntity().copyMembers(memberDto, true);
		memberEntity.setId(null);
		memberEntity.setCreateDt(LocalDateTime.now());
		if ( bAdminMode ) {
			memberEntity.setIsValidEmail(true);
			memberEntity.setRole(Role.USER.toString());
		} else {
			memberEntity.setIsValidEmail(false);
			memberEntity.setRole(Role.GUEST.toString());
			memberEntity.setValidText(Util.getRandomAllString(12));
		}
		memberEntity.setPassword(this.passwordEncoder.encode(memberEntity.getPassword()));
		MemberEntity saved = this.memberJpaRepository.save(memberEntity);
		MemberDto result = (MemberDto)new MemberDto().copyMembers(saved, true);
		return result;
	}

	public boolean isCreateId(String memberId, String signId) throws Mjc813Exception {
		MemberDto findMember = this.findById(memberId);    // id 로 자료를 찾는다.
		if ( findMember != null && findMember.getCreateId().equals(signId) ) {
			return true;
		}
		return false;
	}

	public MemberDto findById(String id) {
		MemberEntity findById = this.memberJpaRepository.findById(Long.parseLong(id)).orElseThrow();
		MemberDto result = (MemberDto)new MemberDto().copyMembers(findById, true);
		return result;
	}

	public MemberDto update(MemberDto updateDto) {
		MemberEntity find = this.memberJpaRepository.findById(updateDto.getId()).orElseThrow();
		MemberEntity memberEntity = (MemberEntity)new MemberEntity().copyMembers(find, true);
		memberEntity.copyMembers(updateDto, false);
		MemberEntity saved = this.memberJpaRepository.save(memberEntity);
		MemberDto result = (MemberDto)new MemberDto().copyMembers(saved, true);
		return result;
	}

	public List<MemberDto> findAll() {
		List<MemberEntity> all = this.memberJpaRepository.findAll();
		List<MemberDto> result = this.transfer(all);
		return result;
	}

	private List<MemberDto> transfer(List<MemberEntity> all) {
		return all.stream()
			.map( x -> (MemberDto)new MemberDto().copyMembers(x, true))
			.toList();
	}

	public MemberDto deleteById(String id) throws Mjc813Exception {
		MemberDto findDto = this.findById(id);    // id 로 자료를 찾는다.
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		IMember signedMember = (IMember)authentication.getPrincipal();
		findDto.setDeleteId(signedMember.getSignId());
		findDto.setDeleteDt(LocalDateTime.now());
		MemberEntity deleteEntity = (MemberEntity)new MemberEntity().copyMembers(findDto, true);
		MemberEntity savedEntity = this.memberJpaRepository.save(deleteEntity);
		MemberDto returnDto = (MemberDto)new MemberDto().copyMembers(savedEntity, true);
		return returnDto;
	}

	public MemberDto findBySignId(String signId) {
		Optional<MemberEntity> bySignId = this.memberJpaRepository.findBySignId(signId);
		if ( bySignId.isPresent() ) {
			MemberEntity member = bySignId.get();
			MemberDto result = (MemberDto)new MemberDto().copyMembers(member, true);
			return result;
		} else {
			return null;
		}
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return this.findBySignId(username);
	}
}
