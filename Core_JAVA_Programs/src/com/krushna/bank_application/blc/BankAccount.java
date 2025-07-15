package com.krushna.bank_application.blc;

import com.krushna.bank_application.Bank;
import com.krushna.custom_exception.AccountNotFoundException;
import com.krushna.custom_exception.InsufficientFundsException;
import com.krushna.custom_exception.InvalidAmountException;
import com.krushna.custom_exception.LoanNotAllowedException;

public class BankAccount implements Bank {
        
    @SuppressWarnings("unused")
	private long accountNumber;
    private double balance;
      public BankAccount(long accountNumber,double balance) {
    	  this.accountNumber=accountNumber;
    	  this.balance=balance;
    	  
      }

	@Override
	public void deposit(double amount) throws InvalidAmountException {
		   if(amount <=0) {
			   throw new InvalidAmountException("Deposit Amount Cannot Be less than Or equal to zero");
		   }
		   else this.balance=amount;
		
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
            
		 if(amount > this.balance) {
			 throw new  InsufficientFundsException("Insuffient Balance your current Balance is "+ this.balance);
		 }else 
			 balance-=amount;
		
	}

	@Override
	public void transfer(BankAccount toAccount, double amount)
			throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException {
		 if(amount > this.balance) {
			 throw new  InsufficientFundsException("Insuffient Balance your current Balance is "+ this.balance);
		 }
		 if(toAccount==null ) {
			 throw new AccountNotFoundException(" Account Not Found Please Create Your Account..");
		 }
		   
		 if(amount <=0) {
			 throw new InvalidAmountException("Deposit Amount Cannot Be less than Or equal to zero");
		 }
		
	}

	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException {
	     if(amount > 20000) {
	    	 throw new  LoanNotAllowedException(" Request Not accepted..");
	     }
	     if(amount <=0) {
			 throw new InvalidAmountException("Deposit Amount Cannot Be less than Or equal to zero");
		 }
		
		
	}

	@Override
	public double getBalance() {
		
		return  this.balance;
	}

	
    
}
