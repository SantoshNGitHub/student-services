package com.practice.app.modal;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document  
public class Student {    
  
	@Id
	private String studentId;
	private String name;
	private Date creationDate = new Date();
	private String address;
}  
