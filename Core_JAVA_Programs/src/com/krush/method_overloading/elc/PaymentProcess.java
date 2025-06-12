package com.krush.method_overloading.elc;

import java.util.Scanner;

import com.krush.method_overloading.blc.Payment;
public class PaymentProcess {
	
	
	public static void main(String args[]) {
		
		Payment py = new Payment();
		System.out.println("Payment Menu");
		
		System.out.println("Please select any one Payment Method from the Menu :");
		System.out.println("\t\t 1) Payment by using Cash ");
		System.out.println("\t\t 2) Payment by using Credit Card ");
		System.out.println("\t\t 3) Payment by using Debit Card ");
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter your Payment choice [1/2/3]");
		int choice= Integer.parseInt(sc.nextLine());
		
		switch(choice) {
		
		case 1:   System.out.println("Enter the amount you want to pay through cash : ");
		
		      double amount= Double.parseDouble(sc.nextLine());
		      
		      py.makePayment(amount);
		      
		      break;
		case 2:
			System.out.println("  Enter your name :");
			String name= sc.nextLine();
		System.out.println("   Enter your 16 digit Credit Card Number : ");
		      String card=sc.nextLine();
		      
		      System.out.println("   Enter your Payment Amount :");
		      
		     amount= Double.parseDouble(sc.nextLine());
		     
		     
		     py.makePayment(name, card, amount);
		     
		     
		     
		     break;
		     
		      
		case 3:
			System.out.println("   Enter your 16 digit Credit Card Number : ");
		       card=sc.nextLine();
		       
			
		       System.out.println("   Enter your Payment Amount :");
			      
			     amount= Double.parseDouble(sc.nextLine());
			     
			     py.makePayment(card, amount);
		        
		break;
		default:  System.err.println("Please Enter valid Option....");
		
		}
		
		
		
		
		
		
	}

}
