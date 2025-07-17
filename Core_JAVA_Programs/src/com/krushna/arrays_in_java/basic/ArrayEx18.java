package com.krushna.arrays_in_java.basic;
import java.util.Arrays;


import com.krushna.arrays_in_java.basic.blc.Product;

//Sort the Product Decending Order  Based On Id, Name, Price.



public class ArrayEx18 {
	
	public static void main(String[] args) 
	{
		
		Product [] products = new Product[5];
		
		products[0] = new Product(111,"LED TV",15000D);
		products[1] = new Product(222,"Mobile",12000D);
		products[2] = new Product(333,"Laptop",80000D);
		products[3] = new Product(444,"Refrigerator",20000D);
		products[4] = new Product(555,"Watch",3000D);

		
		//Orignal Products List 
		
		
		for(Product product : products)
		{
			System.out.printf("Product ID: %d :: Name: %-12s :: Price : %.2fL\n",product.id(),product.name(),product.price());
		}
		
		//Sorting based on product id Decending order
		
		System.out.println("--------------------------------------------");
	
	    System.out.println("Sorting based on product id in Decending order");
		  
		   
	       Arrays.sort(products, (p1, p2)-> Integer.compare(p2.id(),p1.id()));
		   
	       for(Product product : products)
			{
				System.out.printf("Product ID: %d :: Name: %-12s :: Price : %.2fL\n",product.id(),product.name(),product.price());
			}
	       
	       
		
	       System.out.println("--------------------------------------------");
	   	
		    System.out.println("Sorting based on product Name in Decending order");
			  
			   
		       Arrays.sort(products, (p1, p2)-> p2.name().compareTo( p1.name()));
			   
		       for(Product product : products)
				{
					System.out.printf("Product ID: %d :: Name: %-12s :: Price : %.2fL\n",product.id(),product.name(),product.price());
				}
		       
		       
		       
		       
		       

		       System.out.println("--------------------------------------------");
		   	
			    System.out.println("Sorting based on product Price in Decending order");
				  
				   
			       Arrays.sort(products, (p1, p2)-> Double.compare(p2.price(),p1.price()));
				   
			       for(Product product : products)
					{
						System.out.printf("Product ID: %d :: Name: %-12s :: Price : %.2fL\n",product.id(),product.name(),product.price());
					}
		       
			       
			       
			       
			       
			       
			       
			       
	}
	

	
	

}







