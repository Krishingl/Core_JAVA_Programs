package com.krushna.interface_predefine_functions;

import java.util.Scanner;
import  java.util.function.Predicate;
class YourNameIsSachinORNotCheck {
	
	public static void main(String[] args) 
	{
		
		Predicate<String> pd= name-> name.equalsIgnoreCase("Sachsain");
		
		System.out.print("Enter Your Name : ");
		Scanner sc= new Scanner(System.in);
		
		String name = sc.next();
		
		System.out.println("Is name Is Sachin ? "+pd.test(name));
		sc.close();
		
		
		
		
	}

}
