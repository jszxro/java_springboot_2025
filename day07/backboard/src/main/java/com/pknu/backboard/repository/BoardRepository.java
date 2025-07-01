package com.pknu.backboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pknu.backboard.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
    // JpaRepository를 상속받아 기본 CRUD 메서드를 자동으로 제공
    // 추가적인 쿼리 메서드가 필요하면 여기에 정의할 수 있습니다.
    Board findByTitle(String title); // 예시: 제목으로 Board 찾기
    
    List<Board> findByTitleLike(String title);
}
