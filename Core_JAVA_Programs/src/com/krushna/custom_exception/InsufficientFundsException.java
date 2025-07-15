package com.krushna.custom_exception;
         //Cheked Exception class
public class InsufficientFundsException extends Exception {
   // Purpose: Thrown when there are not enough funds for a withdrawal or transfer.
	public static final long serialVersionUID = 1L;
	public InsufficientFundsException() {
		super();
	}

	public InsufficientFundsException(String message) {
		super(message);
		
	}

		
}
