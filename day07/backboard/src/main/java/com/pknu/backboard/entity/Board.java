package com.pknu.backboard.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

@Getter
@Setter // Lombok을 사용하여 Getter와 Setter 자동 생성
@Entity // JPA 엔티티로 지정
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long bno;   // Board 테이블의 PK, bno

    @Column(length = 250)
    private String title;   // 게시판 제목

    @Column(columnDefinition = "CLOB")
    private String content; // 게시글 내용

    @CreatedDate
    @Column(updatable = false) // 한번 작성 후 수정하지 않음
    private LocalDateTime creatDate;    // 게시글 작성일

    @LastModifiedDate
    private LocalDateTime modifyDate;   // 게시글 수정일

    @OneToMany(mappedBy = "board", cascade = CascadeType.REMOVE) 
    private List<Reply> replyList; // 댓글 목록
}
