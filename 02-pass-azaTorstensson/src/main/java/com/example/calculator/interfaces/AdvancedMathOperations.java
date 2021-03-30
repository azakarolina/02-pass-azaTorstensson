package com.example.calculator.interfaces;

public interface AdvancedMathOperations {//här nedan bara signaturer
	public double square(double number);
	//public double raisedToThePowerOf(double base, double exponent);
	//public double remainder(double dividend, double divisor);
	//public double sqrt(double number);
	public double abs(double number); //absoluta värdet (nära noll)
	public double ceil(double number);//avrundar uppåt
	public double floor(double number);//avrundar nedåt
	public double max(double firstNumber,double secondNumber);// högsta värdet
	}
