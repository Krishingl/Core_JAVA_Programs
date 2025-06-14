package com.krush.method_orverloding_compiler_process;

public class MostSpecificDataTypeRule {
	
	public static void main(String []args)
	{
		
		MostSpecificDataTypeRule a= new MostSpecificDataTypeRule ();
		
		a.makePayment();
		
	}
	
         public  void makePayment(long... a) 
         {
        	 System.out.println("Char Having more priorty ");
 	    }
           public  void makePayment(int... b) 
           {
 	        
        	   
        	   System.out.println("Int Having more priority ");
 	   
 	   
              }

}
