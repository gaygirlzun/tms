package com.briup.touhou.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	/**
	 * http://localhost:8080/test/hello
	 * */
	@GetMapping("hello")
	public String hello(){
		return "hello world,你好世界";
	}
}
