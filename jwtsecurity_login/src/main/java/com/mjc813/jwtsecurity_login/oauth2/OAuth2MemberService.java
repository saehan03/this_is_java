package com.mjc813.jwtsecurity_login.oauth2;

import com.mjc813.jwtsecurity_login.model.member.MemberDto;
import com.mjc813.jwtsecurity_login.model.member.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class OAuth2MemberService extends DefaultOAuth2UserService {
    private final MemberService memberService;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        // 부모 클래스로 유저요청을 처리하고 응답 받는다.
        OAuth2User oAuth2User = super.loadUser(userRequest);

        // 각 OAuth 회사의 id 값을 가져온다.
        String registrationId = userRequest.getClientRegistration().getRegistrationId();

        // Member 를 준비한다.
        IOAuth2Member ioAuth2Member = OAuth2MemberFactory.getOauth2MemberOfGoogle(registrationId, oAuth2User.getAttributes());
        String keyName = OAuth2MemberFactory.getOAuth2IdForVendor(registrationId);

        // Oauth2 회사의 정보를 가져온다.
        String vendor = registrationId.toUpperCase();
        String signId = String.format("%s_%s", vendor, ioAuth2Member.getOauth2Id());
        String email = this.getEmail(userRequest, registrationId, ioAuth2Member);
        String name = ioAuth2Member.getName();
        String pictureUrl = ioAuth2Member.getPictureUrl();

        // 우리쪽 DB 작업을 한다.
        MemberDto findDto = this.memberService.findBySignId(signId);
        if ( findDto == null ) {
            findDto =  MemberDto.builder()
                    .signId(signId)
                    .password("")
                    .email(email)
                    .validText(name)
                    .build();
            this.memberService.insert(findDto, true);
        }

        return findDto;
    }

    private String getEmail(OAuth2UserRequest userRequest, String registrationId, IOAuth2Member ioAuth2Member) {
        String email = "";
        try {
            email = ioAuth2Member.getEmail();
        } catch (NullPointerException e) {
        }
        if ( email.isEmpty() ) {
            if ( registrationId.equalsIgnoreCase("GITHUB")) {
                String token = userRequest.getAccessToken().getTokenValue();
                email = this.getEmailFromGitHub(token);
            }
        }
        if ( email.isEmpty() ) {
            email = "notemail@email.com";
        }
        return email;
    }

    private String getEmailFromGitHub(String token) {
        // RestTemplate 등을 사용하여 GET https://api.github.com/user/emails 호출
        // 응답 배열을 파싱하여 primary 이메일 반환 로직 작성
        return "primary_email@example.com";
    }
}
