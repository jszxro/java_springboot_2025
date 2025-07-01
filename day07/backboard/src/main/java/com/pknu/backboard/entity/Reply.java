package com.pknu.backboard.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity // JPA 엔티티로 지정
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long rno; // 댓글 번호

    @Column(length = 1000)
    private String content;

    @CreatedDate
    @Column(updatable = false) // 한번 작성 후 수정하지 않음
    private LocalDateTime creatDate;    // 게시글 작성일

    @LastModifiedDate
    private LocalDateTime modifyDate;   // 게시글 수정일

    @ManyToOne
    private Board board; // 댓글이 속한 게시글

}
