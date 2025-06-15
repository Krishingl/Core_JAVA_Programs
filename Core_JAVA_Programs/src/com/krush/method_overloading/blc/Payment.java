package com.krush.method_overloading.blc;

public class Payment {
	
	public void makePayment(double amount)
	{
		  if( validateAmount(amount)) {
			  
			  System.out.println("Processing payment via Cash...");
			System.out.println("Amount Paid RS : "+amount);
			
			
			System.out.println("Payment Successful!");
			  
		  }
		
	}
	

		
		
public void makePayment(String cardHolderName,String creditCardNumber,double amount)
		{
			   
	if(validateCardNumber(creditCardNumber)&&validateAmount(amount)) {
		
  
		 System.out.println("   Processing payment via Credit Card...");
		 System.out.println("Card Holder: "+ cardHolderName);
		 System.out.println(" Card Number: "+maskCardNumber(creditCardNumber) );
		 System.out.println("  Amount Paid RS : "+amount);
		 System.out.println("Payment Successful!");
	}
			  
			
		}



public void  makePayment(String debitCardNumber, double amount) {
	
if(validateCardNumber(debitCardNumber)&&validateAmount(amount)) {
		
	 System.out.println("   Processing payment via Debitcard Card...");
	 System.out.println(" Card Number: "+maskCardNumber(debitCardNumber) );
	 System.out.println("  Amount Paid RS : "+amount);
	 System.out.println("Payment Successful!");
		
	}
	
	
	
}
//validateAmount
		
private boolean validateAmount(double amount)
{
	if(amount<0) {
		
		System.err.println("Amount should not be negative");
		return false;
		
	}
	 
	return true;
}

//validateCardNumber
 private  boolean validateCardNumber( String cardNumber) {
        	  
        	    if(cardNumber.length()==16) {
        	    	
        	    	
        	    	
        	    	return true;
        	    }
        	    
        	    System.out.print("   Error: Invalid card number. It must be 16 digits.");
        	  return false;
        	  
          }
 private String maskCardNumber(String cardNumber) {
	 
	 
	 return "****-****-****-"+cardNumber.substring(12);
	 
	 
 }
 
}
