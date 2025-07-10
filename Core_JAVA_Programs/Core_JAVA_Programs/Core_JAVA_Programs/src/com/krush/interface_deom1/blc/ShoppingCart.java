package com.krush.interface_deom1.blc;

public class ShoppingCart {

	private double totalAmount;

	public ShoppingCart(double totalAmount) {
		super();
		this.totalAmount = totalAmount;
	}

	public void checkout(Payment payment) {

		System.out.println("Starting checkout for amount RS :" + totalAmount);

		payment.makePayment(totalAmount);
	}

	public void cancelOrder(Payment payment) throws InterruptedException {

		System.out.println("\r\n" + "Order Canceled. Initiating Refund...");

		Thread.sleep(10000);
		System.out.println("Cancelling order for amount RS :" + totalAmount);

		payment.makeRefund(totalAmount);
	}

}
