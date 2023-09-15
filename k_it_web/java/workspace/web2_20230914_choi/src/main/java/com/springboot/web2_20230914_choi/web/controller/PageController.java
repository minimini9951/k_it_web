package com.springboot.web2_20230914_choi.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/index")
	public String index() {
		return "hello";
	}
	
	@GetMapping("/login/username")
	public String login() {
		return "login";
	}
	
//	@ResponseBody // 데이터 전송용
//	@GetMapping("api/v1/username")
//	public String getUsername() {
//		return "gildong";
//	}
}
