package com.springboot.web2_20230914_choi.service.board;

import com.springboot.web2_20230914_choi.web.controller.dto.board.CreateBoardReqDto;

public interface BoardService {
	
	public boolean createBoard(CreateBoardReqDto createBoardReqDto) throws Exception;
}
