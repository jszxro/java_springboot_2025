package com.pknu.backboard.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pknu.backboard.entity.Board;
import com.pknu.backboard.entity.Reply;
import com.pknu.backboard.repository.ReplyRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RelpyService {
    
    @Autowired
    private final ReplyRepository replyRepository;

    public void setReply(Board board, String content){
        Reply reply = new Reply();
        reply.setContent(content);
        reply.setCreatDate(LocalDateTime.now());
        reply.setBoard(board); // 부모 테이블 지정

        this.replyRepository.save(reply); // 댓글 저장
    }
}
