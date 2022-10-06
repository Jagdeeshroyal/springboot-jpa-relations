package com.example.spring.jpa.relations.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.spring.jpa.relations.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	List<Student> findByGuardianName(String name);

	List<Student> findByFirstName(String name);

	List<Student> findByFirstNameContaining(String name);
	
	//JPQL
	@Query("Select distinct s.firstName from Student s")
	List<String> findDistinctFirstName();
	
	//Native
	@Query(value = "SELECT *  FROM tbl_school s where s.first_name = ?1",
			nativeQuery = true)
	List<Student> getStudents(String name);
	
	
	//Native
		@Query(value = "SELECT *  FROM tbl_school s where s.first_name = :name",
				nativeQuery = true)
		List<Student> getStudentsParam(@Param("name")String name);
		
		@Modifying
		@Query(value = "update tbl_school set first_name = ?1 where email_address = ?2",
				nativeQuery = true)
		int updateFirstNameByEmail(String fName, String email);

}
