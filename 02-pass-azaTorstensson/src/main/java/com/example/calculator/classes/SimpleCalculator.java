package com.example.calculator.classes;

import com.example.calculator.interfaces.BasicMathOperations;

public class SimpleCalculator implements BasicMathOperations{
	public double addition(double firstNumber, double secondNumber) {
		double result = firstNumber + secondNumber;
		return result;
	}

	public double subtraction(double firstNumber, double secondNumber) {
		double result = firstNumber - secondNumber;
		return result;
	}

	public double multiplication(double firstNumber, double secondNumber) {
		double result = firstNumber * secondNumber;
		return result;
	}

	public double division(double firstNumber, double secondNumber) {
		if (secondNumber ==0.0) {
			System.out.println("You can not divide by zero");
			return -0.123456789;
		} else {
			double result =firstNumber / secondNumber;
			return result;
		}	
	}
		
}
	




