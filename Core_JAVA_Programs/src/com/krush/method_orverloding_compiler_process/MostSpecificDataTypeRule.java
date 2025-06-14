package com.krush.method_orverloding_compiler_process;

public class MostSpecificDataTypeRule {
	
	
	
	
	public static void main(String []args)
	{
		
		MostSpecificDataTypeRule a= new MostSpecificDataTypeRule ();
		
		a.makePayment();
		//if the compiler have two are more than tow choice to select the method then that time compiler gives the 
		//priority based on the most specific data type, WAV(Widening, Autoboxing, Var-args), and  native data-type  or native class-type.   
		
		
	
		
	}
	
	//rule 1) Based on the specific data type.
	//double>float
	//float>long
	//long>int
	//int>char
	//int >short     {no relation between char and short if its combination there then the compiler Showing error.}
	//short>byte
	
	
         public  void makePayment(long... a) 
         {
        	 System.out.println("Char Having more priorty ");
 	    }
           public  void makePayment(int... b) 
           {
 	        
        	   
        	   System.out.println("Int Having more priority ");
 	   
 	   
              }

}
