package com.board.basic.board.domain.web.board.dto.req;

import com.board.basic.board.domain.web.board.entity.Board;

public record BoardWriteRequestDto(String title, String content, String writerName) {

    public Board toEntity() {
        return Board.builder()
                .title(title)
                .content(content)
                .writerName(writerName)
                .build();
    }
}
