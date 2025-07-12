package com.krushna.arrays_in_java.basic;

abstract class Animals{
	
}


public class AbstractClassArray {

	
	public static void main(String[] args) 
	{
		//We know we can not create the object of abstract class.
		
		//but we can Create the array Object 
		
		Animals[] arr= new Animals[3];  //here not Animals Object Created. internaly here Array Object Created.
// by the help of jvm Class loaded into the jvm memory  thats name is [LFully Qualified Name and its extends Object Class And implements Serilizable , and Cloneble Interface ( both are marker Interface)
	
		System.out.println(arr.getClass().getName());//[Lcom.krushna.arrays_in_java.basic.Animals;
		
		
		
		
		
	}
}
