package com.krush.interface_using_factory_method.blc;

public class PaymentGateway {

	public Payment initiatePayment(Payment payment) // Loose coupling
	{
		System.out.println("Initiating Credit Card payment.");

		if (payment instanceof CreditCardPayment) {
			return payment;
		} else {
			return payment;
		}

	}

}
