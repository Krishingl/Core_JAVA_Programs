package com.krush.method_overriding;

public class MethodOverriding {
	
	  //Method Overriding it possible only the inheritance if we can declare two or more than two method in super and sub class but they have same signature (method name and method parameter)
	// compatible return type that is called method method overriding.
	
	
	//It is not possible without Inheritance concept.
	
	 //while working with method overloading return type must be compatible, So generally we can not change the return type of the overriden method but  from jdk 1.5 we can change the return type by using co-varient(same direction) concept.
	
	
	public static void main(String[] args) {
	     Laptop lap= new HP15();  //Up-casting 
	     
	   lap.charger();
	   lap.keybord();
	   lap.powerOn();
	   
	   System.out.println("------------------------------");
	   
	   lap= new HP();
	   
	   lap.charger();
	   lap.keybord();
	   lap.powerOn();
	   
	   
	   
	   
System.out.println("------------------------------");
	   
	   lap= new Laptop();
	   
	   lap.charger();
	   lap.keybord();
	   lap.powerOn();
	   
	   
	}
	
	
	
	
	
	
	

}




class Laptop 
{
	
	public void  powerOn()
	{
		System.out.println("Generic  Function PowerOn ");
	}
	
	
   
	 public void charger() {
		
		 System.out.println("Generic charger  ");
		
	}



	public void keybord() {
		 System.out.println("Generic Keybord  ");
			
	}
	
	
}

class HP extends Laptop
{
    @Override
	public void  powerOn()
	{
		System.out.println(" HP laptop is ON");
	}
   @Override
public void keybord() {
	System.out.println(" HP laptop is KeyBord");
	}
   
 final public void charger() {
	  
	  System.out.println("HP 64 Watt charger");
  }
   
   
   
   
   
}


class HP15 extends HP
{
	 @Override
		public void  powerOn()
		{
			System.out.println(" HP15 laptop is ON");
		}
	   @Override
	public void keybord() {
		System.out.println(" HP15 laptop is KeyBord");
		}
	   
	  

	
	
	
}



