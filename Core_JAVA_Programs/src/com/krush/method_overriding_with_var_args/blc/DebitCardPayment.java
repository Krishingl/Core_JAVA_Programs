package com.krush.method_overriding_with_var_args.blc;

public class DebitCardPayment extends Payment {
	
	
	@Override 
	public void processPayment() {
		System.out.println("Processing Debit Card payment");
	}
	
	

}
