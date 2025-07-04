package com.krushna.exception_demo;

public class ToShowAllTheExceptionWeHaveInJavaThatSuperClassIsException {

	
	public static void main(String[] args) {
		
		Exception e1 = new ArithmeticException();// Here we are calling no argument constructor.
		
		System.out.println(e1);//java.lang.ArithmeticException
		
		
		
		Exception e2 = new ArithmeticException("Divide By Zero");// Here we are calling parameterized constructor.
		
		
		System.out.println(e2);//java.lang.ArithmeticException: Divide By Zero
		
	}
}
