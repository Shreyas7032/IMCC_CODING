package com.Q1;

public class TempratureConverterImplementation implements TempratureConverter{

	@Override
	public double convertToFarenheight(double celcius) {
		
		return (celcius*9/5)+32;
	}

	@Override
	public double convertToCelcius(double farenheight) {
		
		return (farenheight-32)*5/9;
	}

}
