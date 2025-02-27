package com.example.redis_prac.board.service.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BoardRequest {

    private final String title;
    private final String content;
}
