package com.example.spring.jpa.relations.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
	
	@SequenceGenerator(
			name ="teacher_sequence",
			sequenceName = "teacher_sequence",
			allocationSize = 1)
	@GeneratedValue( strategy = GenerationType.SEQUENCE,
	generator = "teacher_sequence")
	@Id
	private Long teacherId;
	private String firstName;
	private String lastName;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name= "teacher_id",referencedColumnName = "teacherId")
//	
//	private List<Course> courses;

}
