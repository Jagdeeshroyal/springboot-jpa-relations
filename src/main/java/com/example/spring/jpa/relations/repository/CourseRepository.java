package com.example.spring.jpa.relations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.jpa.relations.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
