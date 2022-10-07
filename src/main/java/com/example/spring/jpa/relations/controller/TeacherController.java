package com.example.spring.jpa.relations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.jpa.relations.entity.Teacher;
import com.example.spring.jpa.relations.service.TeacherService;

@RestController
public class TeacherController {
	@Autowired
	private TeacherService teacherService;
	
	@PostMapping("/teacher")
	public Teacher saveTeacher(@RequestBody Teacher teacher) {
		return teacherService.saveTeacher(teacher);
	}

}
