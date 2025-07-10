package com.krushna.lambda_expression;


@FunctionalInterface
interface Printable
{
            void print();
}
public class LambdaDemo1
{

	public static void main(String[] args)
	{   
		
		//using Anonyous function implemting the Printable Functional Interface. 
	  
		Printable p= ()->System.out.println("Printing");
		
	
		
		
		
		
		p.print();

	}

}
