package com.krush.sealed_class;

abstract sealed public class Payment permits DebitCard,CreditCard,UPI
{
	
	    
	 abstract  Object processPayment();
	
	
	
	public static void main(String args[])
	{
		DebitCard debitcard = new DebitCard();
		
	
		DebitCardOffers d = new DebitCardOffers();
		debitcard.processPayment();
		d.processPayment();
		
		
		
		
		
		
		
	}

}



final class CreditCard extends Payment{
	
	public Number processPayment() {
			System.out.println("processing payment using Credit Card");
			
			
			return null;
		}
	
	
	
}


final class UPI extends Payment{
	public  String processPayment() {
			System.out.println("processing payment using UPI Card");
			
			return null;
		}
		
	
}

non-sealed class DebitCard extends Payment
{
       protected  String processPayment() {
    	  
		System.out.println("processing payment using Debit Card");
		return null;
	}
	
       
       
       {
    	 CreditCard c = new CreditCard();
    	 
    	 c.processPayment();
       }
}

 class DebitCardOffers extends DebitCard{
	 
	 
	 
	 
	 

	protected  String offer() {
		
		
		System.out.println("10% instace off ");
		return null;
		
		
	}
	
	
	
	
	
	
	
	

	
}