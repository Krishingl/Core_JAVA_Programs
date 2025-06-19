package com.krush.method_overriding_with_var_args.blc;

public class UPI extends Payment {
	
	
	@Override
	public void processPayment()
	{
	
		System.out.println("Processing UPI payment");
	}
	
	public void offer() {
		System.out.println("Get 100 instance Cash Back...! ");
	}

}
