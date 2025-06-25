package com.krushna.java_8_features.basic_concepts;



interface Alpha {
	
	
	
	default void m1(){
		
		    System.out.println("hello Alpha interface m1");
	}
}

interface Beta {
	
	
	
	default void m1(){
		
		    System.out.println("hello Beta interface m1");
	}
}



class Gamma implements Alpha,Beta
{

	@Override
	public void m1() {
		
		
		//how to call the interface method  by using Interface name +super keyword
		
		Alpha.super.m1();
		Beta.super.m1();
		
		System.out.println("hello  Gamma class m1");
	
	}
	
	
	
}
public class CanWeAchiveTheMultipleInheritaceUsingDefaultMethods
{
	public static void main(String[] args) 
	{
		
		  Gamma gm=new Gamma();
		  
		  
		  gm.m1();
		
		
	}
           
}
