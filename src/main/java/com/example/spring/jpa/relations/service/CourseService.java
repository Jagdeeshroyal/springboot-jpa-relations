package com.example.spring.jpa.relations.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.example.spring.jpa.relations.entity.Course;

public interface CourseService {

	public Course saveCourse(Course course);

	public List<Course> fetchAll();

	public ResponseEntity<Map<String, Object>> getPage();
	
	public ResponseEntity<Map<String, Object>> getPageSorted();


}
