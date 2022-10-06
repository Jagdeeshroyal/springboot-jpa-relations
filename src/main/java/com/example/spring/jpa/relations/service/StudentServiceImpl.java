package com.example.spring.jpa.relations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.spring.jpa.relations.entity.Student;
import com.example.spring.jpa.relations.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	@Transactional //You can put it in a single method or else you can directly place it clss level
	public int updatefirstNameByEmail(String fName, String email) {
		// TODO Auto-generated method stub
		return studentRepo.updateFirstNameByEmail(fName,email);
	}

}
