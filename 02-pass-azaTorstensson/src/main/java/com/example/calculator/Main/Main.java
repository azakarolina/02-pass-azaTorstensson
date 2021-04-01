package com.example.calculator.Main;

import com.example.calculator.classes.ScientificCalculator;
import com.example.calculator.classes.SimpleCalculator;

public class Main {

	public static void main(String[] args) {
		SimpleCalculator simpleCalc = new SimpleCalculator();
		
		System.out.println(simpleCalc.addition(2.0, 2.0));
		System.out.println(simpleCalc.subtraction(2.0, 2.0));
		System.out.println(simpleCalc.multiplication(2.0, 2.0));
		System.out.println(simpleCalc.division(4.0, 2.0));
		
		//ScientificCalculator scientificCalculator = new ScientificCalculator();//undrar lite vad det är för skillnad på detta och nedan?
		//System.out.println(scientificCalculator.square(3));
		//System.out.println(Math.sqrt(4));
		//System.out.println(Math.abs(-25.3));
		//System.out.println(Math.ceil(8.9));
		//System.out.println(Math.floor(8.9));
		//System.out.println(Math.max(2.3,4.9));
		
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		
		System.out.println(scientificCalculator.square(3));
		//System.out.println(scientificCalculator.sqrt(4));
		System.out.println(scientificCalculator.abs(-25.3));
		System.out.println(scientificCalculator.ceil(8.9));
		System.out.println(scientificCalculator.floor(8.9));
		System.out.println(scientificCalculator.max(2.3, 4.9));
		
		
		
		
	}
		
	

}
