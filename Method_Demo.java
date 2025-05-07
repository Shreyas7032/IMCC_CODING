package com.shri;

/*
 * instance variable/instance method only call in only instance method not call in static methods
 * Static variable/static methods call in both static methods as well as instance methods..
 */

public class Method_Demo {
	
	static String collegename;
	int id;
	String name;
	String dept;
	
	void m1()
	{
		System.out.println("I am in m1 instance  method..");
		m2();
		System.out.println(id);
	}
	
	static void m2()
	{
//		Method_Demo d=new Method_Demo();
//		d.m1();   //Directly not call we want to create the object then call
   
		System.out.println("I am in m2 static method..");	
//		System.out.println(id);   //not call
	}
	void m3()
	{
		m1();
		System.out.println("I am a m3 instance method..");	
	}
	static void m4()
	{
		System.out.println("I am in m4 static method");
		m2();
		Method_Demo.collegename="IMCC";
		System.out.println(collegename);
	}
	
	
	
	public static void main(String[] args) {
		Method_Demo d=new Method_Demo();
//		d.m1();
//		Method_Demo.m2();
		Method_Demo.m4();
	}
	
	

}
