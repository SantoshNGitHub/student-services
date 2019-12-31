package com.practice.app.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.practice.app.modal.Student;

@Repository
public class StudentCustomRepositoryImpl implements StudentCustomeRepository {

	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public List<Student> getAllStudents() {

		return null;
	}

	@Override
	public Student getStudentByName(String name) {

		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(name));

		return mongoTemplate.findOne(query, Student.class);
	}

	@Override
	public void addNewStudent(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateStudentDetails(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteStudent(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public String addStudentDetails(String id, String key, String value) {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(id));

		Student student = mongoTemplate.findOne(query, Student.class);
		if (student != null) {
			student.getStudentDetails().put(key, value);
			mongoTemplate.save(student);
			return "Student details added successfully";
		} else {
			return "Unable to add Student details";
		}

	}

	@Override
	public String getStudentDetails(String id, String key) {
		Query query = new Query();
		query.fields().include("studentDetails");
		query.addCriteria(
				Criteria.where("id").is(id).andOperator(Criteria.where("studentDetails." + key).exists(true)));
		Student student = mongoTemplate.findOne(query, Student.class);
		return student != null ? student.getStudentDetails().get(key) : "Unable to fetch student detail";
	}

}
