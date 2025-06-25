package com.krush.interface_deom1.elc;

import java.util.Scanner;

import com.krush.interface_deom1.blc.*;

public class Customer {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your total bill Amount :");
		double amount = sc.nextDouble();
		sc.nextLine();
		System.out.println("Choose Payment Method:\r\n" + "1. Credit Card\r\n" + "2. Debit Card\r\n" + "3. UPI");

		int choice = Integer.parseInt(sc.nextLine());
		ShoppingCart shopCart = new ShoppingCart(amount);
		switch (choice) {
		case 1:

			System.out.println("Enter Account Holder Name : ");

			String name = sc.nextLine();
			CreditCardPayment cpayment = new CreditCardPayment(name);
			shopCart.checkout(cpayment);
			shopCart.cancelOrder(cpayment);

			break;
		case 2:
			System.out.println("Enter Bank Name  : ");

			String bankName = sc.nextLine();

			DebitCardPayment dpayment = new DebitCardPayment(bankName);

			shopCart.checkout(dpayment);
			shopCart.cancelOrder(dpayment);

			break;
		case 3:
			System.out.println("Enter UPI ID : ");

			String upi = sc.nextLine();

			UPIPayment uPayment = new UPIPayment(upi);

			shopCart.checkout(uPayment);
			shopCart.cancelOrder(uPayment);
			break;
		default:
			System.out.println("Select valid Option ");

		}

	}

}
