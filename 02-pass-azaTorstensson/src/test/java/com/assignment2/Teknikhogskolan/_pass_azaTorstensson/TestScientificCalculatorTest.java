package com.assignment2.Teknikhogskolan._pass_azaTorstensson;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import com.example.calculator.classes.ScientificCalculator;

public class TestScientificCalculatorTest {

	ScientificCalculator scientificCalculator = new ScientificCalculator();
	Random random = new Random();

	@Test
	public void testsquare1() {
		double firsttempRandomValue = 0;
		double tempResult = 0;

		firsttempRandomValue = random.nextDouble();
		tempResult = Math.pow(firsttempRandomValue , 2);
		System.out.println("Testing the method square with: firsttempRandomValue, 2    ");// vad ska stå här för att det ska bli snyggt?

		assertEquals(scientificCalculator.square(firsttempRandomValue), tempResult,0);

	}
	@Test
	public void testsquare2() {
		double firsttempRandomValue = 0;
		double tempResult = 0;

		firsttempRandomValue = random.nextDouble();
		tempResult = Math.pow(firsttempRandomValue , 2);
		System.out.println("Testing the method square with:     ");// vad ska stå här för att det ska bli snyggt?

		assertEquals(scientificCalculator.square(firsttempRandomValue), tempResult,-5);

	}
	@Test
	public void testsquare3() {
		double firsttempRandomValue = 0;
		double tempResult = 0;

		firsttempRandomValue = random.nextDouble();
		tempResult = Math.pow(firsttempRandomValue , 2);
		System.out.println("Testing the method square with:     ");// vad ska stå här för att det ska bli snyggt?

		assertEquals(scientificCalculator.square(firsttempRandomValue), tempResult,+5);

	}
	@Test
	public void testabs1() {// It will return the Absolute value of the given value.
		double firsttempRandomValue = 0;
		double tempResult = 0;

		firsttempRandomValue = random.nextDouble();

		tempResult = Math.abs(firsttempRandomValue);
		System.out.println("Testing the method abs with:");// vad ska stå här för att det ska bli snyggt?

		assertEquals(scientificCalculator.abs(firsttempRandomValue), tempResult,0);

	}
	@Test
	public void testabs2() {// It will return the Absolute value of the given value.
		double firsttempRandomValue = 0;
		double tempResult = 0;

		firsttempRandomValue = random.nextDouble();

		tempResult = Math.abs(firsttempRandomValue);
		System.out.println("Testing the method abs with:");// vad ska stå här för att det ska bli snyggt?

		assertEquals(scientificCalculator.abs(firsttempRandomValue), tempResult,-5);

	}
	@Test
	public void testabs3() {
		double firsttempRandomValue = 0;
		double tempResult = 0;

		firsttempRandomValue = random.nextDouble();

		tempResult = Math.abs(firsttempRandomValue);
		System.out.println("Testing the method abs with:");// vad ska stå här för att det ska bli snyggt?

		assertEquals(scientificCalculator.abs(firsttempRandomValue), tempResult,+5);

	}
	@Test
	public void testceil1() {

		double firsttempRandomValue = 0;
		double tempResult = 0;

		firsttempRandomValue = random.nextDouble();// men jag vill ha typ -5 till +5
		tempResult = Math.ceil(firsttempRandomValue);
		System.out.println("Testing the method ceil with:");// vad ska stå här för att det ska bli snyggt?

		assertEquals(scientificCalculator.ceil(firsttempRandomValue), tempResult,0);
	}
	@Test
	public void testceil2() {

		double firsttempRandomValue = 0;
		double tempResult = 0;

		firsttempRandomValue = random.nextDouble();
		tempResult = Math.ceil(firsttempRandomValue);
		System.out.println("Testing the method ceil with:");// vad ska stå här för att det ska bli snyggt?

		assertEquals(scientificCalculator.ceil(firsttempRandomValue), tempResult,-5);
	}
	@Test
	public void testceil3() {

		double firsttempRandomValue = 0;
		double tempResult = 0;

		firsttempRandomValue = random.nextDouble();
		tempResult = Math.ceil(firsttempRandomValue);
		System.out.println("Testing the method ceil with:");// vad ska stå här för att det ska bli snyggt?

		assertEquals(scientificCalculator.ceil(firsttempRandomValue), tempResult,+5);
	}
	@Test
	public void testfloor1() {
		double firsttempRandomValue = 0;
		double tempResult = 0;

		firsttempRandomValue = random.nextDouble();
		tempResult = Math.floor(firsttempRandomValue);
		System.out.println("Testing the method floor with:");// vad ska stå här för att det ska bli snyggt?

		assertEquals(scientificCalculator.floor(firsttempRandomValue), tempResult,0);
	}
	@Test
	public void testfloor2() {
		double firsttempRandomValue = 0;
		double tempResult = 0;

		firsttempRandomValue = random.nextDouble();// men jag vill ha typ -5.0 till +5.0
		tempResult = Math.floor(firsttempRandomValue);
		System.out.println("Testing the method floor with:");// vad ska stå här för att det ska bli snyggt?

		assertEquals(scientificCalculator.floor(firsttempRandomValue), tempResult,-5);
	}
	@Test
	public void testfloor3() {
		double firsttempRandomValue = 0;
		double tempResult = 0;

		firsttempRandomValue = random.nextDouble();
		tempResult = Math.floor(firsttempRandomValue);
		System.out.println("Testing the method floor with:");// vad ska stå här för att det ska bli snyggt?

		assertEquals(scientificCalculator.floor(firsttempRandomValue), tempResult,+5);
	}
	@Test
	public void testmax1() {// It returns the Largest of two values.
		double firsttempRandomValue = 0;
		double secondtempRandomValue = 0;
		double tempResult = 0;

		firsttempRandomValue = random.nextDouble();
		secondtempRandomValue = random.nextDouble();
		tempResult = Math.max(firsttempRandomValue, secondtempRandomValue);
		System.out.println("Testing the method max with:       ");// vad ska stå här för att det ska bli snyggt?


		assertEquals(scientificCalculator.max(firsttempRandomValue, secondtempRandomValue), tempResult,0);
	}
	@Test
	public void testmax2() {// It returns the Largest of two values.
		double firsttempRandomValue = 0;
		double secondtempRandomValue = 0;
		double tempResult = 0;

		firsttempRandomValue = random.nextDouble();
		secondtempRandomValue = random.nextDouble();
		tempResult = Math.max(firsttempRandomValue, secondtempRandomValue);
		System.out.println("Testing the method max with:       ");// vad ska stå här för att det ska bli snyggt?


		assertEquals(scientificCalculator.max(firsttempRandomValue, secondtempRandomValue), tempResult,-5);
	}
	@Test
	public void testmax3() {// It returns the Largest of two values.
		double firsttempRandomValue = 0;
		double secondtempRandomValue = 0;
		double tempResult = 0;

		firsttempRandomValue = random.nextDouble();
		secondtempRandomValue = random.nextDouble();
		tempResult = Math.max(firsttempRandomValue, secondtempRandomValue);
		System.out.println("Testing the method max with:       ");// vad ska stå här för att det ska bli snyggt?


		assertEquals(scientificCalculator.max(firsttempRandomValue, secondtempRandomValue), tempResult,+5);
	}
}
