package com.mjc813.jwtsecurity_login.model.redismember;

import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public class RedisMemberEntity implements IRedisMember {
    private Long id;

    @Id
    private String signId;

    private String password;
    private String email;
    private String role;
    private Boolean isValidEmail;
    @Transient
    private String validText;
    @Transient
    private LocalDateTime createDt;
    @Transient
    private LocalDateTime updateDt;
    @Transient
    private LocalDateTime deleteDt;

    private String accessToken;
    private String refreshToken;
}
