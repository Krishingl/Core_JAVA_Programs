package com.krush.interface_deom1.blc;

public class UPIPayment implements Payment {
	private String upiId;

	public UPIPayment(String upiId) {
		super();
		this.upiId = upiId;
	}

	@Override
	public void makePayment(double amount) {
		System.out.println("Paid RS :" + amount + " using UPI ID : " + upiId);

	}

	@Override
	public void makeRefund(double amount) {

		System.out.println("Refunded RS " + amount + " to UPI ID : " + upiId);

	}

}
