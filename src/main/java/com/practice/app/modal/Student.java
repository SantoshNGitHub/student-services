package com.practice.app.modal;

import java.util.Date;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document  
public class Student {    
  
	@Id
	private String id;
	private String name;
	private Date creationDate = new Date();
	private String address;
	private Map<String, String> studentDetails;
}  
