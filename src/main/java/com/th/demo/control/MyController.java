package com.th.demo.control;

import org.springframework.web.bind.annotation.RequestMapping ;
import org.springframework.web.bind.annotation.RestController ;

@RestController
public class MyController {
	
	@RequestMapping("/sayHi")
	public String sayHi() {
		return "hello world";
	}
}
