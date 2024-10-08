package com.board.basic.board.domain.web.board.service;

import com.board.basic.board.domain.web.board.dto.req.BoardRequestDto;
import com.board.basic.board.domain.web.board.dto.resp.BoardResponseDto;
import com.board.basic.board.domain.web.board.entity.Board;
import com.board.basic.board.domain.web.board.entity.repository.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardMapper boardMapper;

	// 게시판 목록 조회
    public List<BoardResponseDto> getBoardList() {
        List<BoardResponseDto> boardList = boardMapper.getBoardList().stream().map(board -> {
            return new BoardResponseDto(board.getId(), board.getTitle(), board.getContent(), board.getWriterName());
        }).toList();
        return boardList;
    }

	// 게시판 상세 조회
    public BoardResponseDto getBoard(Long id) {
        Board board = boardMapper.getBoard(id);
        if (board == null) {
            return null;
        }
        return new BoardResponseDto(
                board.getId(),
                board.getTitle(),
                board.getContent(),
                board.getWriterName()
        );
    }

	// 게시판 등록
    public int writeBoard(BoardRequestDto dto) {
        return boardMapper.write(dto.toEntity());
    }

	// 게시판 수정
    public int modifyBoard(Long id, BoardRequestDto dto) {
        Board board = dto.toEntity();
        board.setId(id);
        return boardMapper.modifyBoard(board);
    }

	// 게시판 삭제
    public int deleteBoard(Long id) {
        return boardMapper.deleteBoard(id);
    }
}
