/*package com.practice.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.practice.app.modal.Student;
import com.practice.app.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {
		studentRepository.save(student);
		return null;
	}

	@Override
	public List<Student> addStudents(List<Student> studentList) {
		studentRepository.save(studentList);
		return null;
	}

}
*/