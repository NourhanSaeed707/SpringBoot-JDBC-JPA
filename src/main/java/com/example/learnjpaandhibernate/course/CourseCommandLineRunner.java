package com.example.learnjpaandhibernate.course;

import com.example.learnjpaandhibernate.course.Course;
import com.example.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.example.learnjpaandhibernate.course.jpa.Course_JpaRepository;
import com.example.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
//
@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    //JDBC
//    @Autowired
//    private CourseJdbcRepository repository;

    //JPA
//    @Autowired
//    private Course_JpaRepository repository;

    //Spring Data JPA
    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        repository.insert( new Course(1, "Learn AWS JPA", "NOW1"));
//        repository.insert( new Course(2, "Learn SPRINGBOOT JPA", "NOW2"));
//        repository.insert( new Course(3, "Learn DevOps JPA", "NOW3"));
//
//        repository.deleteById(3);
//
//        System.out.println(repository.findById(2));

        repository.save(new Course(1, "Spring Data Jpa1", "now1"));
        repository.save(new Course(2, "Spring Data Jpa2", "now2"));
        repository.save(new Course(3, "Spring Data Jpa3", "now3"));

        repository.deleteById(3l);

//        System.out.println(repository.findById(1l));
//        System.out.println(repository.findById(2l));

        System.out.println(repository.findAll());
        System.out.println("count: " + repository.count());
        System.out.println("findByAuthor: " + repository.findByAuthor("now1"));

        System.out.println("findByName: " + repository.findByName("Spring Data Jpa2"));

    }
}
