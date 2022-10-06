package com.example.spring.jpa.relations.service;

import com.example.spring.jpa.relations.entity.Student;

public interface StudentService {

	public Student saveStudent(Student student);

	public int updatefirstNameByEmail(String fName, String email);

}
