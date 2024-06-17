package com.yse.dev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MyController {
	@GetMapping("/")
	@ResponseBody
	public String myRoot() {
		return "hello my Site!";
	}
	
	@GetMapping("/greeting")
	@ResponseBody
	public String mygreet() {
		return "나의 사이트에 오신걸 환영합니다!";
	}
	
	

}
