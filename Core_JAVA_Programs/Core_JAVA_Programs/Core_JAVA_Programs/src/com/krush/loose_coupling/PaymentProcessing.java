package com.krush.loose_coupling;

public class PaymentProcessing 

{
	
	
	public static void main(String[] args)
	{
		UPI upi = new UPI();
		
		paymentProcessing(upi);
		
		CreditCard CreditCard = new CreditCard();
		
		paymentProcessing(CreditCard);
       DebitCard debitCard = new DebitCard();
		
		paymentProcessing(debitCard);
	}
	
	public static void paymentProcessing(Payment payment)//Loose coupling mean we can pass the any sub class object to the parameter variable
	{
		
		if(payment instanceof UPI)
		{
			
			UPI upi = (UPI) payment ;  // DownCasting
			
			//why we need to down casting here because here we want to call the specific method of UPI class then that reason we want to down casting. 
			// because compiler checking the offer method in the Payment(super) class thats not available thats reason prevent to compilation error we using down casting.

		    upi.makePayment(1000);
		    upi.offer();
		}
		else if(payment instanceof CreditCard creditCard)   //its allows to java 13 version On-word we can write the with instanceof  Operator ClassName After REference Variable name that is allowing java version 13 now we dose not create downCasting explicitly its take care by java compiler.
		{
			creditCard.makePayment(1000);
			creditCard.offer();
		}
		else if(payment instanceof DebitCard debitCard)   //its allows to java 13 version On-word we can write the with instanceof  Operator ClassName After REference Variable name that is allowing java version 13 now we dose not create downCasting explicitly its take care by java compiler.
		{
			debitCard.makePayment(11000);
			debitCard.offer();
		}
		
		
		
	}
	

}


class Payment
{
	
	
	public void  makePayment(double payment) {
		System.out.println("Generic payment is Processing ");
	}
}

class UPI extends Payment
{
	@Override
	public void  makePayment(double payment) {
		System.out.println("Making payment of : "+ payment+" from UPI");
		
	}
	//Specific method
	public void offer() {
		System.out.println("make payment with UPI get 100 Rs cashBack...");
	}
	
}
class CreditCard extends Payment
{
	@Override
	public void  makePayment(double payment) {
		System.out.println("Making payment of : "+ payment+" from CreditCArd");
		
	}
	//specific method 
	public void offer() {
		System.out.println("make payment with Creditcard get 2 day holyday in Goa ...");
	}
	
}


class DebitCard extends Payment
{
	@Override
	public void  makePayment(double payment) {
		System.out.println("Making payment of : "+ payment+" from Debitcard");
		
	}
	//specific method 
	public void offer() {
		System.out.println("make payment with debitcard get NO COST EMI ...");
	}
	
}


