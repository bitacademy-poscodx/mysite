package com.poscodx.mysite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poscodx.mysite.security.Auth;

@Auth(role="ADMIN")
@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@RequestMapping("/board")
	public String board() {
		return "";
	}
	
	@RequestMapping("/user")
	public String board() {
		return "";
	}
	
	
	
}
