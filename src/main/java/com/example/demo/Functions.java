package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller  
@RestController
public class Functions {
	
	// version 3 with several different numbers at the same time
	
	@RequestMapping(value = "/addition3", method = RequestMethod.GET)
	public double addition3(double numbers[]) {	
		
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		return sum;
	}
	
	@RequestMapping(value = "/multiplication3", method = RequestMethod.GET)
	public double multiplication3(double numbers[]) {
		
		double product = 1;
		for (int i = 0; i < numbers.length; i++) {
			product = product * numbers[i];
		}
		return product;
	}
	
	// divides the number by the next number on the right with the result of several numbers in array
	
	@RequestMapping(value = "/division3", method = RequestMethod.GET)
	public double[] division3(double numbers[]) {
		
		double[] quotient = new double [5];
		for (int i = 0; i < numbers.length-1; i++) {
			quotient[i] = numbers[i] / numbers[i+1];
			System.out.println(quotient[i]);
		}
		return quotient;	
			
	}
	
	// version 2 with double
	
	@RequestMapping(value = "/addition2", method = RequestMethod.GET)
	public double addition2(double number1, double number2) {	
			
		return number1 + number2;
	}
			
	@RequestMapping(value = "/multiplication2", method = RequestMethod.GET)
	public double multiplication2(double number1, double number2) {
					
		return number1 * number2;
	}
		
	@RequestMapping(value = "/division2", method = RequestMethod.GET)
	public double division2(double number1, double number2) {
			
		return number1 / number2;
	}
	
	// version 1 with String
	
	@RequestMapping(value = "/addition1", method = RequestMethod.GET)
	public String addition1(String number1, String number2, String sumAdd) {
		double num1 = 0;
		double num2 = 0;
		double sum = 0;
		
		try {
			num1 = Double.parseDouble(number1);
			num2 = Double.parseDouble(number2);
			sum = num1 + num2;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return num1 + " + " + num2 + " = " + sum;
	}
	
	@RequestMapping(value = "/multiplication1", method = RequestMethod.GET)
	public String multiplication1(String number1, String number2, String productMul) {
		double num1 = 0;
		double num2 = 0;
		double product = 0;
		
		try {
			num1 = Double.parseDouble(number1);
			num2 = Double.parseDouble(number2);
			product = num1 * num2;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return num1 + " * " + num2 + " = " + product;
	}
	
	@RequestMapping(value = "/division1", method = RequestMethod.GET)
	public String division1(String number1, String number2, String quotientDiv) {
		double num1 = 0;
		double num2 = 0;
		double quotient = 0;
		
		try {
			num1 = Double.parseDouble(number1);
			num2 = Double.parseDouble(number2);
			quotient = num1 / num2;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (num2 == 0) {
			return "You can´t divide by zero.";
		}
		else {
			return num1 + " / " + num2 + " = " + quotient;
		}
	}

}