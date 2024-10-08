package com.board.basic.board.domain.web.board.controller;

import com.board.basic.board.domain.web.board.dto.req.BoardRequestDto;
import com.board.basic.board.domain.web.board.dto.resp.BoardResponseDto;
import com.board.basic.board.domain.web.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

	// 게시판 목록 조회
    @GetMapping("/board/list")
    public ResponseEntity<?> getBoardList() {
        return ResponseEntity.ok().body(boardService.getBoardList());
    }

	// 게시판 상세 조회
    @GetMapping("/board/{id}")
    public ResponseEntity<?> getBoard(@PathVariable Long id) {
        BoardResponseDto dto = boardService.getBoard(id);
        if (dto == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("해당 게시글이 존재하지 않습니다.");
        }
        return ResponseEntity.ok().body(dto);
    }

	// 게시판 등록
    @PostMapping("/board")
    public ResponseEntity<?> writeBoard(@RequestBody BoardRequestDto dto) {
        int result = boardService.writeBoard(dto);
        if (result == 0) {
            return ResponseEntity.badRequest().body("등록 실패");
        }
        return ResponseEntity.ok().body("등록 성공");
    }
    
	// 게시판 수정
    @PutMapping("/board/{id}")
    public ResponseEntity<?> modifyBoard(@PathVariable Long id, @RequestBody BoardRequestDto dto) {
        int result = boardService.modifyBoard(id, dto);
        if (result == 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("해당 게시글이 존재하지 않습니다.");
        }
        return ResponseEntity.ok().body("수정 성공");
    }

	// 게시판 삭제
    @DeleteMapping("/board/{id}")
    public ResponseEntity<?> deleteBoard(@PathVariable Long id) {
        int result = boardService.deleteBoard(id);
        if (result == 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("해당 게시글이 존재하지 않습니다.");
        }
        return ResponseEntity.ok().body("삭제 성공");
    }
}
