package com.krushna.bank_application;

import com.krushna.bank_application.blc.BankAccount;
import com.krushna.custom_exception.AccountNotFoundException;
import com.krushna.custom_exception.InsufficientFundsException;
import com.krushna.custom_exception.InvalidAmountException;
import com.krushna.custom_exception.LoanNotAllowedException;

public interface Bank {

	// Deposits the specified amount into the account. Throws InvalidAmountException
	// if the amount is less than or equal to zero.

	void deposit(double amount) throws InvalidAmountException;

	// Withdraws the specified amount from the account. Throws
	// InsufficientFundsException if the amount is greater than the account balance.
	// Throws InvalidAmountException if the amount is less than or equal to zero.
	void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException;

	/*
	 * Transfers the specified amount to another account. Throws
	 * InsufficientFundsException if the amount is greater than the account balance.
	 * Throws AccountNotFoundException if the target account is not found. Throws
	 * InvalidAmountException if the amount is less than or equal to zero.
	 * transfer(BankAccount toAccount, double amount)
	 * 
	 */
	void transfer(BankAccount toAccount, double amount)
			throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException;

	/*
	 * Applies for a loan of the specified amount(50000). Throws
	 * LoanNotAllowedException if the loan amount exceeds the allowed limit(50000)
	 * or if the balance is less than specified amount(50000). Throws
	 * InvalidAmountException if the amount is less than or equal to zero.
	 * 
	 * void applyForLoan(double amount)
	 */

	void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException;

	//Returns the current balance of the account.
	 double getBalance();
}
