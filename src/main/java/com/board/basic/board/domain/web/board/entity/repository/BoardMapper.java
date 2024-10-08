package com.board.basic.board.domain.web.board.entity.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

import com.board.basic.board.domain.web.board.entity.Board;

import java.util.List;

@Mapper
public interface BoardMapper {
    int write(Board board);
    List<Board> getBoardList();
    Board getBoard(Long id);
    int modifyBoard(Board board);
    int deleteBoard(Long id);
}
