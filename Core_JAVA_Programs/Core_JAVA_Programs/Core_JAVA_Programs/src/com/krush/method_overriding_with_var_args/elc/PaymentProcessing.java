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
	
	public static void paymentGateway(Payment ... payments) //UpCasting
	{
		
		      
		
		for(Payment payment : payments) {
			
			    if(payment instanceof UPI upi) //now onwards java 13 version we dose not required to explicit down_casting compiler take care only we want write instanceof after class_name and reference name then compiler internaly doing downcasting.
			    {
			    	
			    	   upi.processPayment();
			    	   upi.offer();
			    	
			    }
			    if(payment instanceof CreditCardPayment ) 
			    {        
			    	
			    	//before java 13 version
			    	CreditCardPayment creditcard = (CreditCardPayment) payment;   //DownCasting
			    	
			    	
			    	creditcard.processPayment();
			    	creditcard.offer();
			    }
			if(payment instanceof DebitCardPayment  debitcard) {
				
				debitcard.processPayment();
				debitcard.offer();
				
			}
			
		}
		
	}
	
	
	

}
