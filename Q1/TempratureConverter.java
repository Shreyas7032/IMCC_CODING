package com.Q1;

public interface TempratureConverter {

	double convertToFarenheight(double celcius);
	double convertToCelcius(double farenheight);
	
	public static void about()
	{
		System.out.println("Conversion Of Temprature...");
	}
	
}
