package com.sptek.maven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("/home")
	@ResponseBody
	public String showMain() {
		return "메인화면입니다.";
	}
}
