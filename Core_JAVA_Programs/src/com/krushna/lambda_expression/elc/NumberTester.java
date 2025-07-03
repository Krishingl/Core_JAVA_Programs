package com.krushna.lambda_expression.elc;

import java.util.Scanner;
import java.util.function.Predicate;

public class NumberTester {
	
	public static void main(String args[]) {
		  
		//even numer finding logic 
		Predicate<Integer> isEven= (num)-> (num % 2 == 0);
		
		  //Prime mumber finding logic 
		Predicate<Integer> isPrime=(num)-> {
			  boolean flag=true;
			for(int i=2; i<=num/2; i++) {
				
				if(num%i==0) {
					
					flag=false;
				     break;
				}
			}
			  
		
		return flag;
		};
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		
		
		System.out.println("Is "+num+" even? "+  isEven.test(num));
		
		System.out.println("Is "+num+"  prime? "+  isPrime.test(num));
		
		sc.close();
		
		
	}

}
