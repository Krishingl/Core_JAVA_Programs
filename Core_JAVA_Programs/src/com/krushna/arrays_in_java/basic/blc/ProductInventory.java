package com.krushna.arrays_in_java.basic.blc;



import java.util.Arrays;

import com.krushna.arrays_in_java.basic.custom_exception.ExceptionCapacityInvalid;

public class ProductInventory {
	
	private Product []items;
	
	private int count =0;
	
	  public ProductInventory(int capacity) 
	  {      
		        validCapacity(capacity);
		    items = new Product[capacity];

		    System.out.println("Inventory are Created size :"+ capacity);
		 
		 
	  
	  }
	  
	  //Opration Method area
	 
	  
	  
	  public void addItems(Product p) {
		  if(count< items.length) {
			    items[count++]=p;
		  }else {
			  System.err.println("Inventory Size not Sufficient..!");
		  }
	  }
	  
	  
	  
	  public void displayItems()
	  {
		  for(Product product : items) {
				System.out.printf("Product ID: %d :: Name: %-12s :: Price : %.2fL\n",product.id(),product.name(),product.price());

		  }
		  
		  
	  }
	  
	public void totalPrice() {
	    double totalPrice=0;
	    
	        for(Product item : items) {
	        	
	        	totalPrice+= item.price();
	        }
	    	  
	    System.out.println("Total Price of items : "+totalPrice); 
	    }
	  
	  
	      public void sortDecendingById() 
	      {   
	    	  
	    	  Arrays.sort(items,(i1,i2)->Integer.compare(i2.id(), i1.id()));
	    	  
	    	  
	    	  
	      }
	      public void sortAcendingById() 
	      {   
	    	  
	    	  Arrays.sort(items,(i1,i2)->Integer.compare(i1.id(), i2.id()));
	    	  
	    	  
	    	  
	      }
	  
	  
	  //Exception Method area
	public static void validCapacity(int capacity) 
	{
		if(capacity<1) {
			throw new  ExceptionCapacityInvalid("Capacity Start from 1 only... ");
		}
		
	}
	
	
	

}
