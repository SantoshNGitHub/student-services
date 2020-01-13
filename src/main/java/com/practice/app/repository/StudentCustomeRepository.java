package com.practice.app.repository;

import java.util.List;

import com.practice.app.modal.Student;

public interface StudentCustomeRepository {
	
	List<Student> getAllStudents();
	
	Student getStudentByName(String name);
	
	void addNewStudent(Student student);
	
	String addStudentDetails(String id, String key, String value);
	
	String getStudentDetails(String id, String key);

	void updateStudentDetails(String id, String key, String value);
	
	void deleteStudent(String id);
}
