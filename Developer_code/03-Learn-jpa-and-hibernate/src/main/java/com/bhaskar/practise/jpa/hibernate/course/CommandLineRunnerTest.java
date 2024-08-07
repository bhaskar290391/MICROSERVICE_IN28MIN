package com.bhaskar.practise.jpa.hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bhaskar.practise.jpa.hibernate.course.springDataJpa.CourseSpringJPARepository;

@Component
public class CommandLineRunnerTest implements CommandLineRunner {

//	@Autowired
//	private CourseRepository repo;
	
//	@Autowired
//	private CourseJPARepository repo;
	
	@Autowired
	private CourseSpringJPARepository repo;
	
	@Override
	public void run(String... args) throws Exception {
			
		repo.save(new Course(1, "Learn AWS", "Bhaskar"));
		repo.save(new Course(2, "Learn Spring boot", "Bhaskar"));
		
		repo.deleteById(1l);
		
		System.out.println(repo.findById(2l));
	}

}
