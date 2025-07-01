package com.pknu.backboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pknu.backboard.entity.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
    // JpaRepository를 상속받아 기본 CRUD 메서드를 자동으로 제공
    // 추가적인 쿼리 메서드가 필요하면 여기에 정의할 수 있습니다.

    
}
