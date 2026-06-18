package com.mjc813.sbsecurity_login.model.member;

import com.mjc813.sbsecurity_login.common.ComResponseDto;
import com.mjc813.sbsecurity_login.common.Mjc813Exception;
import com.mjc813.sbsecurity_login.common.ResponseCode;
import com.mjc813.sbsecurity_login.music.MusicDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/member")
public class MemberRestController {
	@Autowired
	private MemberService memberService;

	@PostMapping("")
	@PreAuthorize("hasAnyAuthority('ADMIN')")
	public ResponseEntity<ComResponseDto<MemberDto>> insert(@RequestBody MemberDto memberDto) {
		MemberDto result = this.memberService.insert(memberDto, true);
		return ResponseEntity.status(201).body(
			ComResponseDto.make(ResponseCode.SUCCESS, result)
		);
	}

	@PatchMapping("")
	@PreAuthorize("hasAnyAuthority('ADMIN', 'GUEST', 'USER') or @memberService.isCreateId(#updateDto.id, authentication.name)")
	public ResponseEntity<ComResponseDto<MemberDto>> update(@RequestBody MemberDto updateDto) throws Mjc813Exception {
		MemberDto result = this.memberService.update(updateDto);
		return ResponseEntity.status(HttpStatus.OK).body(
				ComResponseDto.make(ResponseCode.SUCCESS, result)
		);
	}

	@DeleteMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ADMIN') or @memberService.isCreateId(#id, authentication.name)")
	public ResponseEntity<ComResponseDto<MemberDto>> deleteById(@PathVariable String id) throws Mjc813Exception {
		MemberDto result = this.memberService.deleteById(id);
		return ResponseEntity.status(200).body(
				ComResponseDto.make(ResponseCode.SUCCESS, result)
		);
	}

	@GetMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
	public ResponseEntity<ComResponseDto<MemberDto>> findById(@PathVariable String id) throws Mjc813Exception {
		MemberDto result = this.memberService.findById(id);
		return ResponseEntity.status(200).body(
				ComResponseDto.make(ResponseCode.SUCCESS, result)
		);
	}

	@GetMapping("")
	@PreAuthorize("hasAuthority('ADMIN')")
	public ResponseEntity<ComResponseDto<List<MemberDto>>> findAll() {
		List<MemberDto> result = this.memberService.findAll();
		return ResponseEntity.status(200).body(
				ComResponseDto.make(ResponseCode.SUCCESS, result)
		);
	}
}
