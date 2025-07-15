package com.krushna.custom_exception;

public class LoanNotAllowedException extends RuntimeException 
{
	//  Thrown when the loan amount exceeds the allowed limit
      public static final long serialVersionUID= 1L;
      
      
      
      public LoanNotAllowedException() {
    	  
      }
 public LoanNotAllowedException(String message) {
    	  super(message);
      }
}
