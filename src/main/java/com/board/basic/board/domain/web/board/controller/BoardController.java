package com.board.basic.board.domain.web.board.controller;

import com.board.basic.board.domain.web.board.dto.req.BoardWriteRequestDto;
import com.board.basic.board.domain.web.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

	// 게시판 목록 조회

	// 게시판 상세 조회

	// 게시판 등록
    @PostMapping("/board")
    public ResponseEntity<?> writeBoard(@RequestBody BoardWriteRequestDto dto) {
        int result = boardService.writeBoard(dto);
        if (result == 0) {
            return ResponseEntity.badRequest().body("등록 실패");
        }
        return ResponseEntity.ok().body("등록 성공");
    }
	// 게시판 수정

	// 게시판 삭제


}
