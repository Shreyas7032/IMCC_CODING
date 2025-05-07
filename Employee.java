package com.shri;
/*
 * Static variable/method is common for all objects 
 */
public class Employee {
	
	static String CompanyName;
	static char c;
	int empid;
	String name;
	String dept;
	
	public static void main(String[] args) {
		System.out.println(CompanyName);
		System.out.println(c);
		
		
		Employee e1=new Employee();
		Employee.CompanyName="Infosys";
		e1.empid=1;
		e1.name="Shreyas";
		e1.dept="CS";
		System.out.println("Company Name:"+CompanyName+" id:"+e1.empid+" Name:"+e1.name+" dept:"+e1.dept);
		System.out.println("---------------------------------------------------------");
		
		Employee e2=new Employee();
		e2.empid=2;
		e2.name="Shreya";
		e2.dept="ENTC";
		System.out.println("Company Name:"+CompanyName+" id:"+e1.empid+" Name:"+e2.name+" dept:"+e2.dept);
		
		
		
	}

}
