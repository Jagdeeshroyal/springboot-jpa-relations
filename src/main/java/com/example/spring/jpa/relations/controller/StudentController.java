package com.example.spring.jpa.relations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.jpa.relations.entity.Student;
import com.example.spring.jpa.relations.repository.StudentRepository;
import com.example.spring.jpa.relations.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private StudentRepository stdRepo;
	
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/student")
	public List<Student> fetchAll(){
		return stdRepo.findAll();
	}
	
	@GetMapping("/studentname/{name}")
	public List<Student> fetchByNameContains(@PathVariable("name")String name){
		return stdRepo.findByFirstNameContaining(name);
	}
	
	@GetMapping("/studentquery")
	public List<String> findDistinctfirstandLastName(){
		return stdRepo.findDistinctFirstName();
	}
	
	@GetMapping("/studentnativequery/{name}")
	public List<Student> getStudentsbyname(@PathVariable("name") String name){
		return stdRepo.getStudents(name);
	}

	@GetMapping("/studentnativequeryparam/{name}")
	public List<Student> getStudentsbynameParam(@PathVariable("name") String name){
		return stdRepo.getStudentsParam(name);
	}
	
	@PutMapping("/student/{fName}/{email}")
	public int updatefirstNameByEmail(@PathVariable("fName")String fName,
			@PathVariable("email")String email) {
		return studentService.updatefirstNameByEmail(fName,email);
	}
}
