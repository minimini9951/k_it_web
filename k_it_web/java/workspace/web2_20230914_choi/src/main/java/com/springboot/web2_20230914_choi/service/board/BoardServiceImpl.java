package com.springboot.web2_20230914_choi.service.board;

import org.springframework.stereotype.Service;

import com.springboot.web2_20230914_choi.web.controller.dto.board.CreateBoardReqDto;

@Service
public class BoardServiceImpl implements BoardService{

	@Override
	public boolean createBoard(CreateBoardReqDto createBoardReqDto) {
		System.out.println(createBoardReqDto);
		return false;
	}

}
