package com.krush.interface_deom1.elc;
import  com.krush.interface_deom1.blc.*;
public class InterfaceBankingDemo2 {
	public static void main(String[] args)
	{
		 Banking b =new Customer(10000);
		 
		 
		System.out.println( b.getBalance());
		 b.diposit(1000);
		 System.out.println( b.getBalance());
		    b.withdrow(2000);
		 System.out.println( b.getBalance());
		
		
		
		
	}

}
