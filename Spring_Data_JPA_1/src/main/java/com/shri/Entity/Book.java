package com.shri.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Books")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String B_Name;
	private String A_Name;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getB_Name() {
		return B_Name;
	}
	public void setB_Name(String b_Name) {
		B_Name = b_Name;
	}
	public String getA_Name() {
		return A_Name;
	}
	public void setA_Name(String a_Name) {
		A_Name = a_Name;
	}

	
	@Override
	public String toString() {
		return "Book [id=" + id + ", B_Name=" + B_Name + ", A_Name=" + A_Name + "]";
	}
	
	
	
	

}
