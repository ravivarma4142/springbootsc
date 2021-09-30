package com.userdata.data;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "userdata")
public class UserData {

	private String name;
	private int age;
	private String sex;
	private String country;
	private Date createdDate; 
}
