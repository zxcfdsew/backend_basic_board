package com.board.basic.board.domain.web.board.service;

import com.board.basic.board.domain.web.board.dto.req.BoardWriteRequestDto;
import com.board.basic.board.domain.web.board.entity.repository.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardMapper boardMapper;

	// 게시판 목록 조회

	// 게시판 상세 조회

	// 게시판 등록
    public int writeBoard(BoardWriteRequestDto dto) {
        return boardMapper.write(dto.toEntity());
    }
	// 게시판 수정

	// 게시판 삭제
}
