package com.krushna.custom_exception;

public class CarHeatException extends Exception {

	//This class is used for raise the exception if the car engine is more than 50 degrees Celsius

	public static final long serialVersionUID = 1L;
	public CarHeatException(){
		
	}
	
	public CarHeatException(String errorMessage){
		super(errorMessage);
	}
	

}
