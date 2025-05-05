package com.shri;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		
		int ch;
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("Welcome to shreyas Demo System...");
			System.out.println("Enter 1 for Addition \n Enter 2 for Substraction \n Enter 3 for Multiplication \n Enter 4 for Division:");
			System.out.println("Enter Your Choice:");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.print("Enter 1st No:");
					int a=sc.nextInt();
					System.out.print("Enter 2nd No:");
					int b=sc.nextInt();
					int sum=a+b;
					System.out.println("Sum is :"+sum);
					break;
				case 2:
					System.out.print("Enter 1st No:");
					int a1=sc.nextInt();
					System.out.print("Enter 2nd No:");
					int b1=sc.nextInt();
					int result=a1*b1;
					System.out.println("Multiplication is :"+result);
					break;
				case 3:
					System.out.print("Enter 1st No:");
					int a2=sc.nextInt();
					System.out.print("Enter 2nd No:");
					int b2=sc.nextInt();
					int div=a2/b2;
					System.out.println("Division is :"+div);
					break;
				default:
					System.out.println("Invalid Case...");
					
			}
		}
		while(ch!=4);
		
	}

}
