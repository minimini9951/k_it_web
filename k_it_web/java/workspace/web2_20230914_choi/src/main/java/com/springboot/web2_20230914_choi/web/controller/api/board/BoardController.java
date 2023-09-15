package com.springboot.web2_20230914_choi.web.controller.api.board;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web2_20230914_choi.web.controller.dto.board.CreateBoardReqDto;

@RestController
@RequestMapping("/api/v1/board")
public class BoardController {
	
	//게시글 작성
//	@PostMapping("/content")
//	public ResponseEntity<?> addBoard(String title) {
//		System.out.println("게시글 작성완료");
//		System.out.println("title: " + title);
//		return new ResponseEntity<>(title + "게시글 작성 성공", HttpStatus.OK);
//	}

	@PostMapping("/content")
	public ResponseEntity<?> addBoard(CreateBoardReqDto createBoardReqDto) {
		System.out.println("게시글 작성완료");
		System.out.println("title: " + createBoardReqDto.getTitle());
		System.out.println("usercode: " + createBoardReqDto.getUsercode());
		System.out.println("content: " + createBoardReqDto.getContent());
		return ResponseEntity.ok().body("test");
	}
}
