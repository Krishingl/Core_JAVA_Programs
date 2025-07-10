package com.krush.interface_using_factory_method.blc;

public class UPIPayment implements Payment {

	public void processPayment() {
		System.out.println("Processing UPI payment...");

	}

	@Override
	public void applyDiscount() {
		System.out.println("Applying ₹100 cashback for UPI users.");

	}

}
