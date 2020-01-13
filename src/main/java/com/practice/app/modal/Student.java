package com.practice.app.modal;

import java.util.Date;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document  
public class Student {    
  
	@Id
	@TextIndexed
	private String id;
	@TextIndexed
	private String name;
	private Date creationDate = new Date();
	@TextIndexed
	private String address;
	private Map<String, String> studentDetails;
}  
