package com.practice.app.controller;

import java.util.ArrayList;
import java.util.List;
  
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.app.modal.Student;
import com.practice.app.repository.StudentRepository;

@RestController
@RequestMapping(value = "/service")
public class StudentController {

	private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

	@Autowired
	StudentRepository studentRepository;

	@PostMapping(value = "/add")
	public Student addStudent(@RequestBody Student student) {

		try {

			return studentRepository.save(student);

		} catch (Exception e) {
			LOGGER.error("Unable to add student");
		}
		return null;
	}

	@PostMapping(value = "/addBulk")
	public List<Student> addStudents(@RequestBody List<Student> students) {
		try {
			return studentRepository.save(students);

		} catch (Exception e) {
			LOGGER.error("Unable to add students");

		}

		return new ArrayList();
	}

	@GetMapping(value = "list")
	public List<Student> listAllStudents() {

		try {
			return studentRepository.findAll();
		} catch (Exception e) {
			LOGGER.error("Unable to get students");
		}

		return new ArrayList();
	}

	@GetMapping(value = "/{studentId}")
	public Student getStudentByUsername(@PathVariable String studentId) {

		return studentRepository.findOne(studentId);

	}

	/*
	 * @PutMapping(value = "/update/{studentId}/{value}") public Student
	 * updateStudentInfo(@PathVariable String studentId, @PathVariable String value)
	 * {
	 * 
	 * Student student = studentRepository.findOne(studentId);
	 * 
	 * student.setSchool(value);
	 * 
	 * studentRepository.save(student);
	 * 
	 * return student; }
	 */
	
	@DeleteMapping(value = "/delete")
	public void deleteStudent(@PathVariable String studentId) {
		
		studentRepository.delete(studentId);
	}
	
	@DeleteMapping(value = "/deleteAll")
	public void deleteAllStudents() {
		
		studentRepository.deleteAll();
	}

	@GetMapping(value = "/hello")
	public String hello() {

		return "Hello World/n";
	}

}
