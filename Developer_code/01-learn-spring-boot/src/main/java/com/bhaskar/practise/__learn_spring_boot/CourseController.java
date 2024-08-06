package com.bhaskar.practise.__learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	private ConfigurationalPropertiesConfigure congfigure;
	
	@GetMapping("/courses")
	public List<Course> retrieveCourses() {

		return Arrays.asList(

				new Course(1, "Learn AWS", "Bhaskar Mudaliyar"), new Course(2, "Learn Devops", "Maddy Mudaliyar"),
				new Course(3, "Learn AZURE", "Soni Mudaliyar"), new Course(4, "Learn Springboot", "Sammy Mudaliyar"));

	}
	
	
	@GetMapping("/currenyData")
	public ConfigurationalPropertiesConfigure getCurrencyData() {
		return congfigure;
	}

}
