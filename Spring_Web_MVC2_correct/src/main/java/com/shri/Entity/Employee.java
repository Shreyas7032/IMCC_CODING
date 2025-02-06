package com.shri.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@Table(name = "Emp")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	private int id;
	private String name;
	private String role;
	

}
