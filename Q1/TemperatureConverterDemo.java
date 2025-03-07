package com.Q1;

public class TemperatureConverterDemo {

	public static void main(String[] args) {
		TempratureConverterImplementation c=new TempratureConverterImplementation();
		//For Convrt the farenheight to celcius
		double farenheight=86.90;
		double convertToCelcius = c.convertToCelcius(farenheight);
		System.out.println("Conversion of farenheight "+farenheight+" Temparature to Degree Celcius is: "+convertToCelcius);
		
		//convert the degree celcius to farenheight
		
		double degree=90;
		double convertToFarenheight = c.convertToFarenheight(degree);
		System.out.println("Conversion of degree celcius of "+degree+" to farenheight is:"+convertToFarenheight);
		
		
		
	}
}
