package com.example.spring.jpa.relations.service;

import com.example.spring.jpa.relations.entity.CourseMaterial;

public interface CourseMaterialService {

	public CourseMaterial saveMaterial(CourseMaterial courseMaterial);

	public CourseMaterial saveMaterial(CourseMaterial courseMaterial, Long courseId);

}
