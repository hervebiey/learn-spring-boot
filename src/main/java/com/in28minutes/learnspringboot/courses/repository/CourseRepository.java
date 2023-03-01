package com.in28minutes.learnspringboot.courses.repository;

import com.in28minutes.learnspringboot.courses.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
