package com.krushna.lambda_expression.elc;
import java.util.Scanner;
import java.util.function.Consumer;

public class ValueModifier {
	
	
	public static void main(String[] args) 
    {
		
		Consumer<String>  stringConsumer = (str)-> System.out.println("your are given : "+str+" ==> After converting string to uppercase : "+str.toUpperCase());
		
		Consumer<Integer> integerConsumer= (num)-> System.out.println("your are given : "+ num+" After squaring the integer: "+num*num);
		
		
		Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Orignal String : ");
		String stringInput= sc.nextLine();
	     System.out.print("Enter the Orignal Number : ");
		Integer integerInput = Integer.parseInt(sc.nextLine());
		
		
		
		stringConsumer.accept(stringInput);
		System.out.println("=====================================");
		integerConsumer.accept(integerInput);
		
		sc.close();
	}

}
