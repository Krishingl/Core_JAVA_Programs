package com.krushna.custom.exception;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	// Version Compatibilty
	private static final long serialVersionUID = 1L;

	public InvalidAgeException() {
    
	}

	public InvalidAgeException(String errorMessage) {
		super(errorMessage);
	}

}

public class CustomCheckedException 
{
	public static void main(String[] args)
	{
           Scanner sc=new Scanner(System.in);
           try(sc){
        	   System.out.println("Enter the Age : " );
        	   int age= sc.nextInt();
        	   validateAge(age);
           } catch (InvalidAgeException e) {
			
			e.printStackTrace();
		}
	}
	
	static void validateAge(int age) throws InvalidAgeException{
		
		if(age<18) {
			throw new InvalidAgeException("Age is Invalid");
		}
		else {
			System.out.println("You can go for a Movie ");
		}
		
	}
}
