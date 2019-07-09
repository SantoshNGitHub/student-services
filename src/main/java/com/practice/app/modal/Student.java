package com.practice.app.modal;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document  
public class Student {  

	@Id
	private String studentId;
	private String name;
	private String username;
	private String school;
	private Date creationDate = new Date();
	private Map<String, String> address = new HashMap<>();
}
