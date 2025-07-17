package com.krushna.arrays_in_java.basic.custom_exception;

public class ExceptionCapacityInvalid extends RuntimeException
{
	public static final long serialVersionUID= 10L;
	
	public ExceptionCapacityInvalid(){
		
	}
	
public ExceptionCapacityInvalid(String errorMessage){
		
	super(errorMessage);
	}
	
	  

}
