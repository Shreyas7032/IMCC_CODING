package com.tybcs.All_operation;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int roll;
	private String name;
	private String last;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int roll, String name, String last) {
		super();
		this.roll = roll;
		this.name = name;
		this.last = last;
	}


	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", last=" + last + "]";
	}
	
	
	
	
}
