package com.krushna.bank_application.elc;

import java.util.Scanner;

import com.krushna.bank_application.blc.BankAccount;
import com.krushna.bank_application.blc.Customer;
import com.krushna.custom_exception.AccountNotFoundException;
import com.krushna.custom_exception.InsufficientFundsException;
import com.krushna.custom_exception.InvalidAmountException;

public class ATM {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount(1111, 60000); 
		BankAccount acc2 = new BankAccount(2222, 3000);
		
		Customer customer1 = new Customer("Alice", acc1);
		Customer customer2 = new Customer("Bob", acc2);
       
		
		   System.out.println("Select an option :\r\n"
		   		+ "           1. Deposit\r\n"
		   		+ "           2. Withdraw\r\n"
		   		+ "           3. Transfer\r\n"
		   		+ "           4. Loan Application\r\n"
		   		+ "           5. Check Balance\r\n"
		   		+ "           6. Exit");
		   
		   Scanner sc = new Scanner(System.in);
		  
		
		   
		   
		   try(sc){
			   
			   System.out.print("Enter your option : ");
			   int choice = Integer.parseInt(sc.nextLine());
			   
			   System.out.print("Enter Customer name : ");
			   String name= sc.nextLine();
			   Customer cust=null;
			   if(name.equalsIgnoreCase(customer1.getName()) ){
				           
				   cust=customer1;
		    	    
			      }else if(name.equalsIgnoreCase(customer2.getName())){
			    	  
			    	  cust=customer2;
			      }else {
			    	  System.err.println("Invalid name this name any account not found");
			    	  System.exit(0);
			    	  }
			    	  
			   
			   switch(choice) {
			   
			   case 1:
				   System.out.print("Enter deposit amount : ");
				   double amount = sc.nextDouble();
				     
				   cust.getAccount().deposit(amount);
				        
				  System.out.println("Deposit successful. New balance: "+cust.getAccount().getBalance());
				  
			    break;
			   case 2:
				   System.out.print("Enter Withdraw amount : ");
				    amount = sc.nextDouble();
				       
				    cust.getAccount().withdraw(amount);
				    
				    System.out.println("Withdraw Successfull. current Balance is : "+cust.getAccount().getBalance());
				   
				   break;
				   
			   case 3:
			   {
				  
				  
				   System.out.print("Enter amount to transfer : ");
				 amount = sc.nextDouble();
				 
				 cust.getAccount().transfer(acc2, amount);
				    System.out.println(" Amount Transfer Successfull. current Balance is :"+cust.getAccount().getBalance());

				    
				
			   }
			   break;
			   
			   case 4:
				   System.out.print("Enter loan amount to apply:  ");
					 amount = sc.nextDouble();
					 
					 cust.getAccount().applyForLoan(amount);
					    System.out.println("Loan approved. New balance: "+cust.getAccount().getBalance());

				   break;
			   case 5:
				   System.out.println("Your Account Balance is "+cust.getAccount().getBalance());
			     break;
			   case 6: 
				   System.out.println("Thank you for using the ATM. Goodbye! ");
				   break;
				   default :
					   System.err.println("Select the Valid Option..!");
				   
			   
			      }
			   
			   
			   
		   } catch (InvalidAmountException | InsufficientFundsException | AccountNotFoundException e) {
			   System.err.println(e.getMessage());
			   
		}
		   
		   
		   
		   
		   
		   
		   
		   
	}

}
