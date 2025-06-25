package com.krush.interface_deom1.blc;

public class CreditCardPayment implements Payment{
	private String cardHolderName;
	
	public CreditCardPayment(String cardHolderName) {
		super();
		this.cardHolderName = cardHolderName;
	}

	
	

	@Override
	public void makePayment(double amount) {
		
		System.out.println("Paid RS :"+amount+" using Credit Card Holder : "+cardHolderName);
	}

	@Override
	public void makeRefund(double amount) {
		System.out.println("Refunded RS :"+amount+" to Credit Card Holder : "+cardHolderName);
	}
}
