package com.board.basic.board.domain.web.board.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Board {

	private Long id;
	// 게시판 제목
	private String title;
	// 게시판 내용
	private String content;
	// 게시판 작성자
	private String writerName;
}
