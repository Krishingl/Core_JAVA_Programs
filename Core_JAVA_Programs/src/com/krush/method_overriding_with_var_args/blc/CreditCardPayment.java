package com.krush.method_overriding_with_var_args.blc;

public class CreditCardPayment extends Payment 
{

	
	@Override
	public void processPayment() {
		
	System.out.println("Processing credit card payment");
		
	}
	
public void offer() {
		System.out.println("Get 10% instance Discount ");
	}
}
