package com.mjc813.jwtsecurity_login.oauth2;

import java.util.Map;

public class OAuth2MemberFactory {
    /**
     * OAuth2Id 를 가져올때 키의 이름을 리턴한다.
     * @return
     */
    public static String getOAuth2IdForVendor(String registrationId) {
        return switch (registrationId.toUpperCase()) {
            case "GOOGLE" -> "sub";
            case "GITHUB" -> "id";
            default -> "";
        };
    }

    /**
     * Map<String, Object> 데이터형을 받아서 GoogleMember 형으로 객체를 만든다.
     * @param attributes
     * @return
     */
        public static IOAuth2Member getOauth2MemberOfGoogle(String registrationId, Map<String, Object> attributes) {
            return switch (registrationId.toUpperCase()) {
                case "GOOGLE" -> new GoogleOAuth2Member(attributes);
                case "GITHUB" -> new GithubOAuth2Member(attributes);
                default -> null;
            };
    }
}
