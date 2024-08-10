package com.practise.restfull.restcontroller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.practise.restfull.model.HelloBean;

@RestController
public class HelloController {

	@Autowired
	private MessageSource source;
	
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
	
	
	@GetMapping("/helloWorldI18n")
	public String HelloWorldI18n() {
		Locale locale=LocaleContextHolder.getLocale();
		return source.getMessage("good.morning.message", null, "Default Message",locale);
	}
}
