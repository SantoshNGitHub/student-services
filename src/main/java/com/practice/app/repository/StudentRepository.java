package com.practice.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.practice.app.modal.Student;

public interface StudentRepository extends MongoRepository<Student, String>{

}
