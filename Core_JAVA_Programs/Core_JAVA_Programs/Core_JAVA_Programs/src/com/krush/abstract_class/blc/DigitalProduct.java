package com.krush.abstract_class.blc;

public final class DigitalProduct extends Product {
	
private String licenseKey ;

	public DigitalProduct(String name, double price, String category,String licenseKey) {
		super(name, price, category);
		
         this.licenseKey=licenseKey;
}

	@Override
	public void applyDiscount(double percentage) {
		
	double discount = getPrice()*percentage/100;
	
	setPrice(getPrice()-discount);
	
	System.out.println("Discount applied :"+discount);
	System.out.println("New Price :"+getPrice());
	}

	@Override
	public double calculateTax() {
		
		return getPrice()*5/100;
	}

	@Override
	public String toString() {
		
		 
		return "Digital Product :\r\n"
				+ "Product Name: "+getName()+"\r\n"
				+ "Category: "+getCategory()+"\r\n"
				+ "Price RS:"+getPrice()+"\r\n"
				+ "License Key: "+licenseKey+"\r\n";
				
	}
	
	
	
}