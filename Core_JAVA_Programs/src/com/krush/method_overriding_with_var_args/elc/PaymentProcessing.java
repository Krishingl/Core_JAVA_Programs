package com.krush.method_overriding_with_var_args.elc;

import com.krush.method_overriding_with_var_args.blc.CreditCardPayment;
import com.krush.method_overriding_with_var_args.blc.DebitCardPayment;
import com.krush.method_overriding_with_var_args.blc.Payment;
import com.krush.method_overriding_with_var_args.blc.UPI;

public class PaymentProcessing {
	public static void main(String[] args) 
	
	{
		    UPI upi=new UPI();
		    DebitCardPayment debitcard = new DebitCardPayment();
		    CreditCardPayment creditcard = new CreditCardPayment();
		    	
		    paymentGateway(upi , debitcard,creditcard);
		
		
	}
	
	public static void paymentGateway(Payment ... payments) {
		
		
		
		for(Payment payment : payments) {
			
//			    if(payment instanceof UPI ) {
//			    	
//			    }
			
			payment.processPayment();
		}
		
	}
	
	
	

}
