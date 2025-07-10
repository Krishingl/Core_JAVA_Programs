package com.krush.abstract_class.elc;
import com.krush.abstract_class.blc.*;
import java.util.Scanner;

public class ProductStore {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.println("Select Product Type:\r\n"
		    		+ "1. Digital Product\r\n"
		    		+ "2. Physical Product");
		    int choice =sc.nextInt();
		    
		    
		    switch(choice) {
		    
		    case 1:   
		    	System.out.print(" Enter Digital Product Name :  ");
		    	 sc.nextLine();
		    	 String name=sc.nextLine();
		    	System.out.print("Enter Product Price : ");
		    	 double price= Double.parseDouble(sc.nextLine());
		    	
		    	System.out.print("Enter Product Category : ");
		    	String cat= sc.nextLine();
		    	System.out.print("Enter Product License Key :  ");
		    	   String lKey=sc.nextLine();
		    	System.out.println("Enter the discount % on final bill");
		    	double percentage= sc.nextDouble();
		    	DigitalProduct dp= new DigitalProduct(name, price, cat, lKey);
		    	   
		    	
		    	System.out.println(dp);
		    	dp.applyDiscount(percentage);
		    	System.out.println("Tax RS : "+dp.calculateTax());
		    	
		    	
		    	
		    	break;
		    	
		    case 2:  	
		    	   
		    	System.out.print(" Enter Digital Product Name :  ");
		    	 sc.nextLine();
		    	name=sc.nextLine();
		    	System.out.print("Enter Product Price : ");
		    	  price= Double.parseDouble(sc.nextLine());
		    	
		    	System.out.print("Enter Product Category : ");
		     cat= sc.nextLine();
		     
		     System.out.print("Enter Product weight : ");
		     double weight = Double.parseDouble(sc.nextLine());
		     
		     
		     System.out.println("Enter the discount % on final bill");
		    	 percentage= sc.nextDouble();
		    	 
		    	 
		    	
		    	
		    	
		    }
		

	}

}
