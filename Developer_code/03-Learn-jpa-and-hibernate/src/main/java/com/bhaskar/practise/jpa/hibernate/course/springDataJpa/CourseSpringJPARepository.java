package com.bhaskar.practise.jpa.hibernate.course.springDataJpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bhaskar.practise.jpa.hibernate.course.Course;

@Repository
public interface CourseSpringJPARepository extends JpaRepository<Course, Long> {

}
