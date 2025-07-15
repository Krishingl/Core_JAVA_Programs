package com.krushna.custom_exception;

public class AccountNotFoundException extends Exception {
     
	//Purpose: Thrown when an account is not found during a transfer.

	public static final long serialVersionUID =1L;
	
	
	
	public AccountNotFoundException() {
		
	}
public AccountNotFoundException(String errorMessage) {
		super(errorMessage);
	}
}
