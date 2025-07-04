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
		
		
		
		
	}
}
