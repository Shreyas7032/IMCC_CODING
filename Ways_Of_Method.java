package com.shri;

/*
 * Their are 4 ways to define methods in java
 */

public class Ways_Of_Method {
	
	//1.without return type,without parameter
	void m1()
	{
		System.out.println("without return type,without parameter..");
	}
	
	//2.with return type,without parameter
	String m2()
	{
		return "with return type,without parameter..";
	}
	
	//3.without return type with parameter
	void m3(int x)
	{
		System.out.println("without return type with parameter");
	}
	
	//4.with return type with parameter..
	String m4(int x)
	{
		return "with return type with parameter...";
	}
	
	public static void main(String[] args) {
		Ways_Of_Method w=new Ways_Of_Method();
		w.m1();
		
		String s=w.m2();
		System.out.println(s);
		
		w.m3(12);
		
		String s1=w.m4(2);
		System.out.println(s1);
	}
	
	

}
