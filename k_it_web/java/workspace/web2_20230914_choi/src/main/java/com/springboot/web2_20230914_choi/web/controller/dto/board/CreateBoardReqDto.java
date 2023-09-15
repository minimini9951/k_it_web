package com.springboot.web2_20230914_choi.web.controller.dto.board;

import lombok.Data;

@Data
public class CreateBoardReqDto {
	
	private String title;
	private int usercode;
	private String content;
}
