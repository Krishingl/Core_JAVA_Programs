package com.krushna.custom_exception;

public class CarStoppedException extends Exception {

	public final static long serialVersionUID = 1L;

	public CarStoppedException() {
		super();

	}

	public CarStoppedException(String errorMessage) {
		super(errorMessage);
		// Purpose: This class is used for raise the exception if car is stops for
		// reasons other than puncture or overheating.

	}

}
