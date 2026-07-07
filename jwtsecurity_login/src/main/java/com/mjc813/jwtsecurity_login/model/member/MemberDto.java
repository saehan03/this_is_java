package com.mjc813.jwtsecurity_login.model.member;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class MemberDto implements IMember {
	private Long id;
	private String signId;
	private String password;
	private String email;
	private String role;
	private Boolean isValidEmail;
	private String validText;
	private LocalDateTime createDt;
	private LocalDateTime updateDt;
	private LocalDateTime deleteDt;

	private String createId;
	private String updateId;
	private String deleteId;
}
