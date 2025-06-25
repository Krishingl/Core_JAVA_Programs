package com.krush.interface_deom1.blc;

public class DebitCardPayment implements Payment {
	private String bankName;
	
	
	public DebitCardPayment(String bankName) {
		super();
		this.bankName = bankName;
	}

	@Override
	public void makePayment(double amount) {
		System.out.println("Paid RS :"+amount+" using Debit Card Bank: "+bankName);
		
	}

	@Override
	public void makeRefund(double amount) {
		System.out.println("Refunded RS ::"+amount+" to Debit Card Bank: "+bankName);
		
		
	}

}
