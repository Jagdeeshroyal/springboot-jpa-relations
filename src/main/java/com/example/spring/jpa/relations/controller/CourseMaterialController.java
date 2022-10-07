package com.example.spring.jpa.relations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.jpa.relations.entity.CourseMaterial;
import com.example.spring.jpa.relations.service.CourseMaterialService;

@RestController
public class CourseMaterialController {

	
	@Autowired
	private CourseMaterialService courseMaterialService;
	
	@PostMapping("/CourseMaterial")
	public CourseMaterial saveMaterial(@RequestBody CourseMaterial courseMaterial) {
		return courseMaterialService.saveMaterial(courseMaterial);
	}
	
	@PostMapping("/CourseMaterial/{courseId}")
	public CourseMaterial saveMaterial(@RequestBody CourseMaterial courseMaterial,
			@PathVariable("courseId") Long courseId) {
		return courseMaterialService.saveMaterial(courseMaterial,courseId);
	}
}
