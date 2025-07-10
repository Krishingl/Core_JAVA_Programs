package com.krush.method_overriding;
import java.util.Scanner;


/**
  Online Payment Management System.
  
  Module name : MakePayment
            Option:
                   1) UPI
                   2) CreditCard
                   3) DebitCard
                   4) Cash
                   5) Exit
   
 */




public class MakePayment {
	
	
	
	public static void main(String ... arg)
	{
		 Scanner sc = new Scanner(System.in);
		 
		 
		 Payment payment= null;
		 

		 System.out.println("   ------Make Payment Option------   ");
		 
		 System.out.println("                   1) UPI\r\n"
		 		+ "                   2) CreditCard\r\n"
		 		+ "                   3) DebitCard\r\n"
		 		+ "                   4) Cash  \r\n"
		 		+"                   5) Exit  \r\n");
		 
		 
		 
		
		 
	  
	         
	         boolean flag = true;
	         while(flag) {
	        	 System.out.print("Select Your Option : ");
		         int choice= Integer.parseInt(sc.nextLine());
	        	 
	        
	         switch(choice){
	        	 
	        	 
	         case 1: payment = new UPI();
//	                 flag =false;
	         break;
	         case 2: payment = new CreditCard();
//	                 flag =false;
	         break;
	         case 3: payment = new DebitCard();
	         
//	                  flag =false;
	         break;
	         case 4: payment = new Cash();
	                
	         
	         break;
	         case 5: System.out.println("       Thank For Visting...  ");
	        	 
	        	 System.exit(0);
	         break;
	         default: System.err.println("          You Selected Invalid Option Please Select Correct Option.");
	                  
	        	 
	         }
	         
	         if(choice<5) {
	        	 flag=false;
	        	 payment.processPayment();
	         }
	      
	         
	         
	        	 
	         }
	         
//	         
//             if(!(choice == 5 ) ) {
//	        	 
//	        	 payment.processPayment();
//	         }
	       
	         
	         
	         
		 
		
		
	}

}


class Payment
{
	
	public void processPayment()
	{
		
		System.out.println("Processing Genric Payment");
	}
}

class  UPI extends Payment
{
	
	@Override
	public void processPayment()
	{
		System.out.println("Processing UPI Payment");
	}
}

class  CreditCard extends Payment
{
	@Override
	public void processPayment() {
		System.out.println("Processing CreditCard Payment");
	}
	
	
	
	
}

class DebitCard extends Payment
{
	
	@Override
	public void processPayment() {
		System.out.println("Processing DebitCard Payment...");
	}
	
}

class Cash extends Payment
{
	
	
	@Override
	public void processPayment() {
		System.out.println("Processing Cash Payment....");
	}
}
