package com.springboot.web2_20230914_choi.web.controller.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class User {
	private String username;
	private String password;
	private String name;
	private String email;
}
