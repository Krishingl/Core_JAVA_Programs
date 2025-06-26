package com.krush.interface_using_factory_method.elc;

import java.util.Scanner;


import com.krush.interface_using_factory_method.blc.*;


public class PaymentGatewayUsingInterface {
	public static void main(String[] args) {
		
		
		System.out.println("Select your payment Option :\r\n"
				+ "	 1) Credit Card \r\n"
				+ "	 2) UPI ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Enter your Choice :");
		
	  int choice = sc.nextInt();
	  PaymentGateway gPayment=new PaymentGateway();
	  switch(choice)
	  {
	  case 1: Payment p= gPayment.initiatePayment(new CreditCardPayment());
	                  p.applyDiscount();
	                  p.processPayment();
	  break;
	  case 2: p= gPayment.initiatePayment(new UPIPayment());
      p.applyDiscount();
      p.processPayment();
		      
		        
	  
	  
	  }
	  
	  
		
		
	}

}
