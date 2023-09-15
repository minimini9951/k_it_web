package com.springboot.web2_20230914_choi.web.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web2_20230914_choi.web.controller.dto.TestRespDto;
import com.springboot.web2_20230914_choi.web.controller.dto.User;

@RestController //@Responsebody와 @Controller를 합친 annotation
@RequestMapping("/api/v1")
public class ApiTestController {
	@GetMapping("/username")
	public String getUsername() {
		return "gildong";
	}
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}
	
	// 객체 생성이 필요할땐 new로 만들지 말고 builder를 사용할 것
	@GetMapping("/userTest")
	public Object getUserTest() {
		return TestRespDto.builder()
				.username("gildong")
				.password("1234")
				.build();
	}
	
	@GetMapping("/user")
	public Object get() {
		return User.builder()
				.username("gildong")
				.password("1234")
				.name("길동")
				.email("gildong@")
				.build();
	}
	
	@PostMapping("/userLogin")
	public Object postUserLogin(String name, int password) {
		return name + password;
	}
	
	@GetMapping("/userLogin")
	public Object getUserLogin(String name, int password) {
		return name + password;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
