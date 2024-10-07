package com.board.basic.board.domain.web.user.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
	private Long id;
	// 사용자 아이디
	private String userId;
	// 사용자 비밀번호
	private String password;
	// 사용자 이름
	private String name;
	// 사용자 이메일
	private String email;
}
