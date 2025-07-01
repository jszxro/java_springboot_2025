package com.pknu.backboard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pknu.backboard.entity.Board;
import com.pknu.backboard.repository.BoardRepository;

@SpringBootTest
class BackboardApplicationTests {

	// TDD

	@Autowired
	private BoardRepository boardRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testInsertJpa() {
		Board board1 = new Board();
		board1.setTitle("첫번째 게시글입니다."); // @Setter에서 자동 생성해주는 메서드
		board1.setContent("내용은 없습니다.");
		board1.setCreatDate(LocalDateTime.now());

		Board board2 = new Board();
		board2.setTitle("두번째 게시글입니다.");
		board2.setContent("내용은 없다니까요.");
		board2.setCreatDate(LocalDateTime.now());

		this.boardRepository.save(board1); // INSERT 진행
		this.boardRepository.save(board2); // INSERT 진행

	}

	@Test // SELECT * 테스트
	void testSelectJpa() {
		List<Board> all = this.boardRepository.findAll();
		// 테스트시 내가 기대하는 값과 현재 값이 같은지 확인 메서드
		assertEquals(2, all.size());

		Board board = all.get(0);
		assertEquals("첫번째 게시글입니다.", board.getTitle());
	}

	@Test // SELECT FROM WHERE 테스트
	void testSelectOneJpa() {
		// Optrional -> Null을 허용
		Optional<Board> opBoard = this.boardRepository.findById(2L);
		if (opBoard.isPresent()) {
			Board board = opBoard.get();
			assertEquals("내용은 없다니까요.", board.getContent());
		}
	}

	@Test
	void testSelectByTitle() {
		Board board = this.boardRepository.findByTitle("두번째 게시글입니다.");
		assertEquals(2L, board.getBno());

	}

	@Test
	void testSelectByTitleLike() {
		List<Board> boards = this.boardRepository.findByTitleLike("%게시글%");
		assertEquals(4, boards.size());

		Board board = boards.get(0);
		assertEquals("첫번째 게시글입니다.", board.getTitle());
	}

	@Test // 삭제
	void testDeleteLastOne() {
		assertEquals(4, boardRepository.count());
		Optional<Board> opBoard = this.boardRepository.findById(2L);
		assertTrue(opBoard.isPresent());

		Board board = opBoard.get();
		this.boardRepository.delete(board); // 삭제
		assertEquals(3, boardRepository.count());
	}

	@Test // 수정
	void testUpdateOne() {
		Optional<Board> opBoard = this.boardRepository.findById(1L);
		assertTrue(opBoard.isPresent());

		Board board = opBoard.get();
		board.setContent("내용이 테스트에서 변경되었습니다!!!");

		this.boardRepository.save(board); // 수정은 save로 가능
	}
}
