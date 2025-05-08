package com.shrii;

import java.util.Arrays;
import java.util.List;

public class Test {

	List<Integer> get5Marks(List<Integer> list)
	{
		return list;
	}
	
	String[] getStudentName(String names[])
	{
		return names;
	}
	
	
	
	public static void main(String[] args) {
		Test t=new Test();
		List<Integer> result=t.get5Marks(Arrays.asList(12,34,45,55));
		for(int x:result)
		{
			System.out.print(" "+x);
		}
		
//		--------------------------------------------------------------------------------------
		String []names= {"Shreyas","Tejas","Om","Kartikey"};
		String []name=t.getStudentName(names);
		for(String i:name)
		{
			System.out.print(" "+i);
		}
		
		
	}
}
