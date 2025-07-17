package com.krushna.arrays_in_java.basic;
//Real-time flipkart product sorting program 
import java.util.Arrays;
import java.util.Comparator;

import com.krushna.arrays_in_java.basic.blc.Product;

/* short the Product Object Based on the given Criteria:
 *  a) Based on the Product Id.
 *  b) Based on the Product Name.
 *  c) Based on the Product Price.
 */
          


public class ArrayEx17 {
   public static void main(String[] args) throws ClassCastException
   {
	Product [] products = new Product[7];
	
	
	products[0]= new Product(1, "Laptop", 40000D);
	products[1]= new Product(1, "Mobile", 10000D);
	products[2]= new Product(1, "LED", 15000D);
	products[3]= new Product(1, "Watch", 1000D);
	products[4]= new Product(1, "Camera", 50000D);
	products[5]= new Product(1, "PowerBank", 2000D);
	products[6]= new Product(1, "EarPhones",  1100D);
	
	
	System.out.println("Orignal Product Data Default  format : ");
	
	//retriveing the data from Arrays Object we need to use for each loop

	for(Product product : products) 
	{
		System.out.println("Poduct id: "+product.id()+" :: name : "+product.name()+" :: Price : "+product.price());
		
	}
	
	/*
	
	
	//Now we know in flipkart We have a Options shorting 
	               // Can we sort Over Products ?
	                  //-> yes java provides Sorts the array object purpose One method in Arrays Class that is sort() method that is static method
	                           //this sort method is static and its work on the base of internaly compareTo() method.
	                             //if we want to sort the any class array object then that in one way only then must we can use comparable interface
	
	
	Arrays.sort(products);
	
	*/
	System.out.println("==========================================================================================");
	
	System.out.println("Sort the Product  Object Based On the ID :  ");
	
	//Anonymous inner class for Comparator method Overriding
	
	  Comparator<Product> compId = new Comparator<Product>()
	  {

		@Override
		public int compare(Product p1, Product p2) {
			
			return Integer.compare(p1.id(), p2.id());
		}
		  
	  };
	
	   Arrays.sort(products,compId);
	   for(Product product : products) 
		{
			System.out.println("Poduct id: "+product.id()+" :: name : "+product.name()+" :: Price : "+product.price());
			
		}
    System.out.println("==========================================================================================");
	
	System.out.println("Sort the Product  Object Based On the Name :  ");
	
	
	
	//labda Expression using Comparator method Override
	 
	Comparator<Product> compName= (p1,p2)->  p1.name().compareTo(p2.name());
	
	
	Arrays.sort(products,compName);
	
	for(Product product : products) 
	{
		System.out.println("Poduct id: "+product.id()+" :: name : "+product.name()+" :: Price : "+product.price());
		
	}
	
	
	
    System.out.println("==========================================================================================");
	
	System.out.println("Sort the Product  Object Based On the Price :  ");
	
	//labda Expression we can Passing direct as Method parameter.
	 
		Arrays.sort(products,(p1,p2)-> Double.compare(p1.price(), p2.price()));
		
		
		for(Product product : products) 
		{
			System.out.println("Poduct id: "+product.id()+" :: name : "+product.name()+" :: Price : "+product.price());
			
		}
		
}
   
   
}
