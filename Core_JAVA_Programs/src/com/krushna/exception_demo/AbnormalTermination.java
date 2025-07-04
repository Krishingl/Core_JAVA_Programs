package com.krushna.exception_demo;

import java.util.Scanner;

public class AbnormalTermination {

	public static void main(String[] args) 
	{
	     System.out.print("Main Method Started...");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a:");
		int a= sc.nextInt();
		
		
		System.out.print("Enter the value of b:");
		int b= sc.nextInt();
		
		int result = a/b;
		
		
		System.out.println("a / b is : " + result);
		
		
		
		System.out.println("Main Method Ended...");
		sc.close();
		
		
		//here if we will pass b = 0 then we will get java.lang.ArithmaticException our program will be terminated midele, that is called abnormaly termination and halt in the middel.
		// JVM internaly  have his Exception Handler, which will provide the exception message and Terminate the program i the middle
	}
}
