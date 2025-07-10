package com.krush.interface_using_factory_method.blc;

public class CreditCardPayment implements Payment {

	@Override
	public void processPayment() {
		System.out.println("Processing credit card payment...");

	}

	@Override
	public void applyDiscount() {
		System.out.println("Applying 10% discount for credit card users.");

	}

}
