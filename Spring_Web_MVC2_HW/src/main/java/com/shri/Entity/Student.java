package com.shri.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String mail;
	private String Gender;
	private String courses;
	
	public Student(String name, String mail, String gender, String courses) {
		super();
		this.name = name;
		this.mail = mail;
		this.Gender = gender;
		this.courses = courses;
	}
	
	
	
	

}
