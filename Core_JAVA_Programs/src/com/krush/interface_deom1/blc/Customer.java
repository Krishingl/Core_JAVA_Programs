package com.krush.interface_deom1.blc;

import com.krushna.bank_application.blc.BankAccount;

public class Customer implements Banking
{ 
	private double balance ;
	
	
	public Customer(double balance) {
		
		this.balance = balance;
	}


	
	@Override
	public void diposit(double balance) {
		
		    if(balance<0) {
		    	System.err.println("Deposite Amount can be grater than zero");
		    	
		    }else 
		  
		    	this.balance+=balance;
		  
	}


	@Override
	public void withdrow(double balance) {
		      if(balance >=this.balance) {
		    	 System.err.println("insuffitiant Balance");
		      }
		      else {
		    	  this.balance=this.balance-balance;
		    	  
		    	  
		      }
	}


	@Override
	public double getBalance() {
		
		return this.balance;
	}
   
	
	
	

}
