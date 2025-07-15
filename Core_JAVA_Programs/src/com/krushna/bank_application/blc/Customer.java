package com.krushna.bank_application.blc;

public class Customer 
//implements Comparable
{
	
     private String name;
     private BankAccount account;
     
     
     
     public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public BankAccount getAccount() {
		return account;
	}



	public void setAccount(BankAccount account) {
		this.account = account;
	}



	public Customer(String name , BankAccount account)
     {
    	 this.name=name;
    	 this.account=account;
    	 
     }



//	@Override
//	public int compareTo(Object o) {
//	               Customer c= (Customer) o;
//		return this.name.compareTo(c.name);
//	}

}
