package com.krushna.lambda_expression;


interface Vehicle{
	void run();
	
}
public class LambdaDemo2 
{
	
	public static void main(String args[]) {
		Vehicle car= ()->
		{
			System.out.println("car is Running");
			
		};
		
		
		
		car.run();
		
		System.out.println("------------------------------------------------------");
		Vehicle bike= ()->
			System.out.println("bike is Running");
			
			
			bike.run();
			System.out.println("------------------------------------------------------");
		
		Vehicle bus= ()->System.out.println("bike is Running");
			bus.run();
	
	}
	

}
