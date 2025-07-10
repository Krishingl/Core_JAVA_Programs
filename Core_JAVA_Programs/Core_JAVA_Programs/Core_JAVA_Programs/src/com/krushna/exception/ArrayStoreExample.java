package com.krushna.exception;

public class ArrayStoreExample {
	
	public static void storeObjects()  
	{
	
		Object[]  strings = new String[5];
		 strings[0] = "Hello";   // Storing a String
	      strings[1] = "World";   // Storing another String
	      strings[2] = "Java";    // Storing another String
	      
	  System.out.print(strings[1]);
	     strings[3] = 123;       // Trying to store an Integer in a String array
	      
		
	}
	public static void main(String args[]) {
		    try {
		    	storeObjects();
		    }catch(ArrayStoreException e) {
		    	
		    	System.out.print(" "+e.getClass().getName() +" : "+e.getMessage());
		    	
		    }
		
		
		
	}
	

}
