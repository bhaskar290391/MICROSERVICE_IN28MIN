package com.practise.restfull.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.practise.restfull.model.HelloBean;

@RestController
public class HelloController {

	@GetMapping("/helloWorld")
	public String HelloWorld() {
		return "Hello World ";
	}
	
	@GetMapping("/helloWorldBean")
	public HelloBean HelloWorldBean() {
		return new HelloBean( "Hello World ");
	}
	
	
	@GetMapping("/helloWorldpathVariable/{name}")
	public HelloBean HelloWorldpathVariable(@PathVariable("name") String name) {
		return new HelloBean(String.format("Hello World, %s",name ) );
	}
}
