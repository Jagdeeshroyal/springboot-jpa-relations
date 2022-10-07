package com.example.spring.jpa.relations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.jpa.relations.entity.Course;
import com.example.spring.jpa.relations.entity.CourseMaterial;
import com.example.spring.jpa.relations.repository.CourseMaterialRepository;
import com.example.spring.jpa.relations.repository.CourseRepository;

@Service
public class CourseMaterialServiceImpl implements CourseMaterialService{
	
	@Autowired
	private CourseMaterialRepository courseMaterialRepo;
	
	@Autowired 
	private CourseRepository courseRepo;

	@Override
	public CourseMaterial saveMaterial(CourseMaterial courseMaterial) {
		// TODO Auto-generated method stub
		return courseMaterialRepo.save(courseMaterial);
	}

	@Override
	public CourseMaterial saveMaterial(CourseMaterial courseMaterial, Long courseId) {
		Course course = courseRepo.findById(courseId).get();
		courseMaterial.setCourse(course);
		return courseMaterialRepo.save(courseMaterial);
	}
	
	

}
