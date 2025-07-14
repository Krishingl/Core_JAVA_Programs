package com.krushna.custom_exception;

public class CarPunctureException extends Exception {
      //Version Compability
	public static final long serialVersionUID = 1L;
	// This class is used for raise the exception if car is punctured.

	public CarPunctureException() {

		super();
	}

	public CarPunctureException(String errorMessage) {
		super(errorMessage);
	}

}
