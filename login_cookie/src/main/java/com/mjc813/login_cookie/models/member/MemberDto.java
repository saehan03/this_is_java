package com.mjc813.login_cookie.models.member;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberDto implements IMember {
    private Long id;
    private String signid;
    private String password;
    private String email;
    private Boolean isvalidEmail;
    private LocalDateTime createDt;
    private LocalDateTime updateDt;
    private LocalDateTime deleteDt;
}
