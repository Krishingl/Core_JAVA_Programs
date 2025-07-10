package com.krush.string_handling;

public class StringObjectNotEligibleGC {
 
	public static void main(String[] args) throws Exception
	{
	
		    String s1="india";
		    System.out.println("S1 hash code = "+s1.hashCode());
		    s1=null;
		    System.gc();
//		    System.out.println("S1 hash code = "+s1.hashCode());
		
     Thread.sleep(3000);//3 second sleep mode
     System.out.println("main method wakeup after 3 sec ");
       
     String s2="india";

	    System.out.println("S1 hash code = "+s2.hashCode());
	    
	   //String object are not eligible for garbage collector because its created in the very special area that 
	    // String constant Poll(SCP) in the heap area.
	    
	   
     
     
     
	}
	
	
}
