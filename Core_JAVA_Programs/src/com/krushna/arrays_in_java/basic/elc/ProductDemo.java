package com.krushna.arrays_in_java.basic.elc;
import java.util.*;

import com.krushna.arrays_in_java.basic.blc.Product;
import com.krushna.arrays_in_java.basic.blc.ProductInventory;
import com.krushna.arrays_in_java.basic.custom_exception.ExceptionCapacityInvalid;

public class ProductDemo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		try(sc){
		System.out.println("\t\t..Wellcome to Emart.com..");
	      System.out.print("Enter the E-Bag Capacity : ");
	      
	      ProductInventory product = new ProductInventory(Integer.parseInt(sc.nextLine()));
	      
	          
//	      System.out.print("Can You Want to add the Product (Y/N) : " );
//	        char option= sc.next().toLowerCase().charAt(0);
//	      if(option=='n') {
//	    	  System.out.println("Thank You for visting..!");
//	    	  System.exit(0);
//	      }else {
//	    	    System.out.print("Enter product id : ");
//	    	    int proId=Integer.parseInt(sc.nextLine());
//	    	    System.out.print("Enter product name : ");
//	    	       
//	    	  
//	    	  
//	    	  
//	      }
//	      
	      
	      product.addItems(new Product(111,"laptop",70000D));
	      product.addItems(new Product(222,"Mobile",10000D));
	      product.addItems(new Product(555,"Earphone",900D));
	      product.addItems(new Product(333,"AC",90000D));
	      product.addItems(new Product(444,"TV",12000D));
	      
	      product.displayItems();
	      System.out.println("-----------------------------------------------");
	      System.out.println("-----------------------------------------------");
	      product.totalPrice();
	      System.out.println("-----------------------------------------------");
	      System.out.println("-----------------------------------------------");
	      System.out.println("Sorting by Id Accending Order");
	     product.sortAcendingById();
	     product.displayItems();
	     System.out.println("-----------------------------------------------");
	      System.out.println("-----------------------------------------------");
	      System.out.println("Sorting by Id Decending Order");
	     product.sortDecendingById();
	     product.displayItems();
	      
	      
	      
		}
		catch(InputMismatchException | ExceptionCapacityInvalid e) {
			System.err.println("Capacity Only Integer capacity valid is 1 or more than.. ");
			
		}
		
		
		
		
		
		
		

	}

}
