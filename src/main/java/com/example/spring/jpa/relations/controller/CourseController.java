package com.example.spring.jpa.relations.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.jpa.relations.entity.Course;
import com.example.spring.jpa.relations.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;

	@PostMapping("/course")
	public Course saveCourse(@RequestBody Course course) {
		return courseService.saveCourse(course);
	}
	
	@GetMapping("/courses")
	public List<Course> fetchAll(){
		return courseService.fetchAll();
	}
	
	@GetMapping("/page")
	public ResponseEntity<Map<String,Object>> getPages(){
		
		
		return courseService.getPage();
	}
	@GetMapping("/pagesort")
	public ResponseEntity<Map<String,Object>> getPagesSort(){
		
		
		return courseService.getPageSorted();
	}
}
