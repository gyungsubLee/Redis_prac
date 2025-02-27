package com.example.redis_prac.board.entity;

import com.example.redis_prac.board.service.response.BoardResponse;
import com.example.redis_prac.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "boards")
public class Board extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public BoardResponse toDto() {
        return BoardResponse.builder()
                .id(id)
                .title(title)
                .content(content)
                .createdDate(getCreatedAt())
                .updatedDate(getUpdatedAt())
                .build();
    }
}
