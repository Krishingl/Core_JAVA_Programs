package com.krush.interface_test;


interface Alpha
{
public	static  final int x=102;


      default void m11() {
    	  System.out.println("I am default method from Alpha interface ");
      }
      
      

}


//implements Alpha

abstract class Beta 
{
	
     int x=100;
	
    public void m11() {
      	  System.out.println("I am default method from Beta  class ");
        }
        
   	
	
	
}

class Gamma extends Beta implements Alpha
{
	int x=10;
	void m1() {
		System.out.println("krushna ingle"+"   "+x);  //variable hidding
		System.out.println("krushna ingle"+"   "+super.x);//Beta abstact class x will come 
	System.out.println("krushna ingle"+"   "+Alpha.x);  //interface x value are come
	
	
	
	 super.m11();
	 
	 Alpha.super.m11();
	}
	
}




public class VariableHidingInsideInterfaceandImplementerClass 
{

	
	public static void main(String[] args) {
		
//		Beta b= new Beta();
		//here now we can create the Beta class object because they are  abstarct class.
//		b.m1();
		
		Gamma g= new Gamma();
		g.m1();
		
	    
	}
	
}
