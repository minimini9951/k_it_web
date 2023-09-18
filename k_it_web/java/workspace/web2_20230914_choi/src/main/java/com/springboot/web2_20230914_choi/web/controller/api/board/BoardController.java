package com.springboot.web2_20230914_choi.web.controller.api.board;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web2_20230914_choi.service.board.BoardService;
import com.springboot.web2_20230914_choi.service.board.BoardServiceImpl;
import com.springboot.web2_20230914_choi.web.controller.dto.board.CreateBoardReqDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/board")
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardService boardService;
	
	//게시글 작성
//	@PostMapping("/content")
//	public ResponseEntity<?> addBoard(String title) {
//		System.out.println("게시글 작성완료");
//		System.out.println("title: " + title);
//		return new ResponseEntity<>(title + "게시글 작성 성공", HttpStatus.OK);
//	}
	
//	BoardService boardService = new BoardServiceImpl();

	// json형식 파일을 받아올때는 @RequestBody를 넣어줘야함
	@PostMapping("/content")
	public ResponseEntity<?> addBoard(@RequestBody CreateBoardReqDto createBoardReqDto) {
		System.out.println("게시글 작성완료");
		System.out.println("title : " + createBoardReqDto.getTitle());
		System.out.println("usercode : " + createBoardReqDto.getUsercode());
		System.out.println("content : " + createBoardReqDto.getContent());
//		boolean result = boardService.createBoard(createBoardReqDto);
		boolean responseData = false;
		try {
			responseData = boardService.createBoard(createBoardReqDto);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.internalServerError().body(responseData);
		}
		
		return ResponseEntity.ok().body(responseData);
	}
}
