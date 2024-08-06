package com.bhaskar.practise.jpa.hibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.bhaskar.practise.jpa.hibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPARepository {

	@PersistenceContext
	EntityManager manager;

	public void insertCourse(Course course) {
		manager.merge(course);

	}

	public Course findById(long id) {
		return manager.find(Course.class, id);
	}

	public void delete(long id) {
		Course course = manager.find(Course.class, id);
		manager.remove(course);
	}

}
