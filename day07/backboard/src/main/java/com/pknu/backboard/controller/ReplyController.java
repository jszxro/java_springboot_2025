package com.pknu.backboard.controller;

// 댓글 관련 컨트롤러
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pknu.backboard.entity.Board;
import com.pknu.backboard.service.BoardService;
import com.pknu.backboard.service.RelpyService;

import ch.qos.logback.core.model.Model;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


// /reply로 시작하는 요청을 처리
@RequestMapping("/reply")
@Controller
@RequiredArgsConstructor
@Log4j2
public class ReplyController {

    // 게시글 서비스 (게시글 정보 조회용)
    @Autowired
    private final BoardService boardService;

    // 댓글 서비스 (댓글 등록 등)
    @Autowired
    private final RelpyService relpyService;    

    // 댓글 등록 처리
    // @param model   : 뷰에 데이터 전달용 (현재 미사용)
    // @param bno     : 게시글 번호 (PathVariable)
    // @param content : 댓글 내용 (RequestParam)
    // @return        : 댓글 등록 후 해당 게시글 상세페이지로 리다이렉트
    @PostMapping("/create/{bno}")
    public String setReply(Model model, @PathVariable("bno") Long bno, 
                            @RequestParam(value= "content") String content) {
        Board board = this.boardService.getBoardOne(bno); // 게시글 정보 조회
        this.relpyService.setReply(board,content);         // 댓글 등록
        
        return String.format("redirect:/board/detail/%d", bno); // 게시글 상세로 이동
    }
    
}
