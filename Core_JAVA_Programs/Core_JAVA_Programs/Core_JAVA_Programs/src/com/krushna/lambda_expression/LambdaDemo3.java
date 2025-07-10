package com.krushna.lambda_expression;
@FunctionalInterface
interface Calculator
{
	void doSum(int x,int y);  //Interface Function
	
}

public class LambdaDemo3
{
	public static void main(String[] args) 
	{
		
		
		//Anonymous Inner class it is use to impliment the implements the interface
		Calculator c1=new Calculator(){
			
			
			  public void doSum(int x,int y) {
				  
				  System.out.println("The Sum of Two Number is : "+(x+y));
				  
			  }
		};
		
		c1.doSum(10, 50);
		
		
	//Functional Programing
		//we are using here lambda expression in that internary anonymous function are working 
		//lambda expression it is a anonymous functions
		
		Calculator  c2= (x,y)-> System.out.println("The Sum of Two Number is : "+(x+y));
		
		c2.doSum(10, 50);
		
	}


}
