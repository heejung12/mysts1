package com.yse.dev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
	@GetMapping("/")
	public String myRoot() {
		return "hello my Site!";
	}
	
	@GetMapping("/greeting")
	public String mygreet() {
		return "나의 사이트에 오신걸 환영합니다!";
	}
	
	

}
