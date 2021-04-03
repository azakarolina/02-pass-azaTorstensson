package com.assignment2.Teknikhogskolan._pass_azaTorstensson;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import com.example.calculator.classes.SimpleCalculator;

public class TestSimpleCalculatorTest extends SimpleCalculator {
	SimpleCalculator simpleCalc = new SimpleCalculator();
	Random random = new Random();
	
	@Test
	public void testAddition1() {
		double firsttempRandomValue = 0;
		double secondtempRandomValue = 0;
		double tempResult =0;
		
		firsttempRandomValue = random.nextDouble();
		secondtempRandomValue = random.nextDouble();
				tempResult = secondtempRandomValue + firsttempRandomValue;
				System.out.println("Testing the method addition with:" );// vad ska stå här för att det ska bli snyggt?
		assertEquals(simpleCalc.addition( firsttempRandomValue,secondtempRandomValue),tempResult,0);
	}
	@Test
	public void testAddition2() {
		double firsttempRandomValue = 0;
		double secondtempRandomValue = 0;
		double tempResult =0;
		
		firsttempRandomValue = random.nextDouble();
		secondtempRandomValue = random.nextDouble();
				tempResult = secondtempRandomValue + firsttempRandomValue;
				System.out.println("Testing the method addition with:" );
		assertEquals(simpleCalc.addition( firsttempRandomValue, secondtempRandomValue),tempResult,-5);
	}	
	@Test
	public void testAddition3() {
		double firsttempRandomValue = 0;
		double secondtempRandomValue = 0;
		double tempResult =0;
		
		firsttempRandomValue = random.nextDouble();
		secondtempRandomValue = random.nextDouble();
				tempResult = secondtempRandomValue + firsttempRandomValue;
				System.out.println("Testing the method addition with:" );
		assertEquals(simpleCalc.addition( firsttempRandomValue , secondtempRandomValue),tempResult,+5);
	}		
		
	

	@Test
	public void testsubtraction2() {
		double firsttempRandomValue = 0;
		double secondtempRandomValue = 0;
		double tempResult = 0;
		
		firsttempRandomValue = random.nextDouble();
		secondtempRandomValue = random.nextDouble();
		
		tempResult = firsttempRandomValue-secondtempRandomValue;
		System.out.println("Testing the methodsubtraction with:");// vad ska stå här för att det ska bli snyggt?
		 
		assertEquals(simpleCalc.subtraction(firsttempRandomValue,secondtempRandomValue),tempResult,-5);
	}
	@Test
	public void testsubtraction3() {
		double firsttempRandomValue = 0;
		double secondtempRandomValue = 0;
		double tempResult = 0;
		
		firsttempRandomValue = random.nextDouble();
		secondtempRandomValue = random.nextDouble();
		
		tempResult = firsttempRandomValue-secondtempRandomValue;
		System.out.println("Testing the method subtraction with:");
		
		assertEquals(simpleCalc.subtraction(firsttempRandomValue,secondtempRandomValue),tempResult,+5);
	}
	
	@Test
	public void testmultiplication1() {
		double firsttempRandomValue = 0;
		double secondtempRandomValue = 0;
		double tempResult = 0;
		
		firsttempRandomValue = random.nextDouble();
		secondtempRandomValue = random.nextDouble();
		
		tempResult = firsttempRandomValue*secondtempRandomValue;
		System.out.println("Testing the method multiplication with:");
		
		assertEquals(simpleCalc.multiplication(firsttempRandomValue,secondtempRandomValue),tempResult,0);
	}
	@Test
	public void testmultiplication2() {
		double firsttempRandomValue = 0;
		double secondtempRandomValue = 0;
		double tempResult = 0;
		
		firsttempRandomValue = random.nextDouble();
		secondtempRandomValue = random.nextDouble();
		
		tempResult = firsttempRandomValue*secondtempRandomValue;
		System.out.println("Testing the method multiplication with:");
		
		assertEquals(simpleCalc.multiplication(firsttempRandomValue,secondtempRandomValue),tempResult,-5);
	}
	@Test
	public void testmultiplication3() {
		double firsttempRandomValue = 0;
		double secondtempRandomValue = 0;
		double tempResult = 0;
		
		firsttempRandomValue = random.nextDouble();
		secondtempRandomValue = random.nextDouble();
		
		tempResult = firsttempRandomValue*secondtempRandomValue;
		System.out.println("Testing the method multiplication with:");
		
		assertEquals(simpleCalc.multiplication(firsttempRandomValue,secondtempRandomValue),tempResult,+5);
	}
	
	@Test
	public void testdivision1() {
		double firsttempRandomValue = 0;
		double secondtempRandomValue = 0;
		double tempResult = 0;
			
		firsttempRandomValue = random.nextDouble();
		secondtempRandomValue = random.nextDouble();
			
		tempResult = firsttempRandomValue/secondtempRandomValue;
		System.out.println("Testing the method division with:");
			
		assertEquals(simpleCalc.division(firsttempRandomValue,secondtempRandomValue),tempResult,0);
	}
	@Test
	public void testdivision2() {
		double firsttempRandomValue = 0;
		double secondtempRandomValue = 0;
		double tempResult = 0;
			
		firsttempRandomValue = random.nextDouble();
		secondtempRandomValue = random.nextDouble();
			
		tempResult = firsttempRandomValue/secondtempRandomValue;
		System.out.println("Testing the method division with:");
			
		assertEquals(simpleCalc.division(firsttempRandomValue,secondtempRandomValue),tempResult,-5);
	}
	@Test
	public void testdivision3() {
		double firsttempRandomValue = 0;
		double secondtempRandomValue = 0;
		double tempResult = 0;
			
		firsttempRandomValue = random.nextDouble();
		secondtempRandomValue = random.nextDouble();
			
		tempResult = firsttempRandomValue/secondtempRandomValue;
		System.out.println("Testing the method division with:");//  vad ska stå här för att det ska bli snyggt?
			
		assertEquals(simpleCalc.division(firsttempRandomValue,secondtempRandomValue),tempResult,+5);
	}
}
			
			

