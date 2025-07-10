package com.krush.object_class_equals_method.blc;

public class Product {

	private int productId;
	private String productName;

	public Product(int productId, String productName) {
		this.productId = productId;
		this.productName = productName;

	}

	public int getProductId() {
		return this.productId;

	}

	public String getProductName() {
		return this.productName;

	}

	@Override
    public boolean equals(Object obj) 
	{
		 if(obj instanceof Product)
		 {
			 Product pd2= (Product) obj;
			 
			 if(this.productId== pd2.productId &&  this.productName.equals(pd2.productName)) 
			 {
			 
			 
			 
			 return true;
			 }else {
				 
				
				 return false;
			 }
			 
		 }else {
			 
			 System.err.println("Your passing Object Thats not Product Type Please pass correct object.. thank you");
			 
			 return false;
		 }
		
		 
		
		 
	}
	@Override
	public int hashCode() 
	{
	return this.productId;	
	}

}
