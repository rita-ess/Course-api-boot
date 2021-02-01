package org.mql.java.springBoot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	//we can also just do (@RequestMapping("/hello")
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String sayHi() {
		return "Hi world";
	}
	
	
	//second way of annotation
	@RequestMapping(value="/bye")
	public String sayBye() {
		return "Bye world";
	}	
}
