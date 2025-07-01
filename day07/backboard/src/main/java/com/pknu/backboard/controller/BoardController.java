package com.pknu.backboard.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pknu.backboard.entity.Board;
import com.pknu.backboard.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequestMapping("/board")
@Controller
@Log4j2
@RequiredArgsConstructor
public class BoardController {
    
    private final BoardService boardService;

    @GetMapping("/list")
    public String getList(Model model) {
        List<Board> boardList = this.boardService.getBoardList();

        model.addAttribute("boardList", boardList); // 모델에 게시판 목록 추가
        return "board_list"; // 뷰 이름을 반환
    }

    @GetMapping("/detail/{bno}")
    public String getDetail(Model model, @PathVariable("bno") Long bno) {
        Board board = this.boardService.getBoardOne(bno);

        model.addAttribute("board", board); // 모델에 게시판 상세 정보 추가
        return "board_detail"; // 뷰 이름을 반환
    }
}
