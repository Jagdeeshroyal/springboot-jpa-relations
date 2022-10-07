package com.example.spring.jpa.relations.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.spring.jpa.relations.entity.Course;
import com.example.spring.jpa.relations.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseRepository courseRepo;
	

	@Override
	public Course saveCourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepo.save(course);
	}


	@Override
	public List<Course> fetchAll() {
		return courseRepo.findAll();
	}


	@Override
	public ResponseEntity<Map<String, Object>> getPage() {
		Map<String,Object> mp = new HashMap<>();
		Pageable f = PageRequest.of(0, 3);
		
		List<Course> courses  = courseRepo.findAll(f).getContent();
		long in = courseRepo.findAll(f).getTotalElements();
		long iny = courseRepo.findAll(f).getTotalPages();
		
		mp.put("Courses", courses);
		mp.put("Total number of Elements", in);
		mp.put("Total Pages", iny);
		
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(mp);
	}

	@Override
	public ResponseEntity<Map<String, Object>> getPageSorted() {
		Map<String,Object> mp = new HashMap<>();
		Pageable f = PageRequest.of(0, 3,Sort.by("title"));
		
		List<Course> courses  = courseRepo.findAll(f).getContent();
		long in = courseRepo.findAll(f).getTotalElements();
		long iny = courseRepo.findAll(f).getTotalPages();
		
		mp.put("Courses", courses);
		mp.put("Total number of Elements", in);
		mp.put("Total Pages", iny);
		
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(mp);
	}
	
}
