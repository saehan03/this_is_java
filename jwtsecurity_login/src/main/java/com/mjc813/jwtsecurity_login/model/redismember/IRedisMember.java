package com.mjc813.jwtsecurity_login.model.redismember;

import com.mjc813.jwtsecurity_login.model.member.IMember;

public interface IRedisMember extends IMember {
    String getAccessToken();
    void setAccessToken(String accessToken);

    String getRefreshToken();
    void setRefreshToken(String refreshToken);

    default IRedisMember clone(IRedisMember source, boolean bForced) {
        if ( source == null ) {
            return this;
        }
        IMember.super.copyMembers(source, bForced);
        if (bForced || source.getAccessToken() != null ) {
            this.setAccessToken(source.getAccessToken());
        }
        if (bForced || source.getRefreshToken() != null ) {
            this.setRefreshToken(source.getAccessToken());
        }
        return this;
    }
}
