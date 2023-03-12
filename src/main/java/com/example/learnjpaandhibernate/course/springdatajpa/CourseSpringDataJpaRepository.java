package com.example.learnjpaandhibernate.course.springdatajpa;

import com.example.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

    //custom method in repository
    List<Course> findByAuthor(String Author);

    List<Course> findByName(String Name);
}
