package com.krushna.custom_exception;

public class InvalidAmountException extends RuntimeException {

	public static final long serialVersionUID = 1L;
	
	
	public InvalidAmountException() {
		
	}
	public InvalidAmountException(String message) {
		super(message);
	}

}
