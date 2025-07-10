package com.krush.method_overriding;

public class WhatIsOverriding {
	  
	
   public static void main(String args[])
   {
	   Animal a = new Dog(); //Up-casting
	   
	  a.speek();
	  
	  Dog d =(Dog)a;  //Down-casting 
	  
	  
	  
	  d.speek();
	  
	 
	   
   }
	
	
	

}



class Animal
{
	
	
	
	public void   speek() {
		
		
		System.out.println("Generic animal are speeking");
	}
}
class Dog extends Animal
{
	//Replacing super class method body  implementation with sub class method that is called Overriding.
	
	//Method Implementation
public void   speek() {
		
		
		System.out.println("Dog is speeking");
	}
	
	
	
	
}