package com.example.calculator.classes;

import com.example.calculator.interfaces.AdvancedMathOperations;

public class ScientificCalculator extends SimpleCalculator implements AdvancedMathOperations{

	public double square(double number) {
		double result = number * number;
		return result;
	}
	
	public double abs(double number) {
		double result = Math.abs(number);
		return result;
	}
	public double ceil(double number) {
		double result = Math.ceil(number);
		return result;
	}
	public double floor(double number) {
	double result = Math.floor(number);
	return result;
	}
	public double max (double firstNumber, double secondNumber) {
	double result = Math.max(firstNumber, secondNumber);
	return result;
	}
	
		
	}
	
	

	





