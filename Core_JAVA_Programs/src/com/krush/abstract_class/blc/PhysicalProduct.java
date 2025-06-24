package com.krush.abstract_class.blc;

public final class PhysicalProduct extends Product {
   private double shippingWeight;
	public PhysicalProduct(String name, double price, String category,double shippingWeight ) {
		super(name, price, category);
		this.shippingWeight=shippingWeight;
		
	}

	public void applyDiscount(double percentage) {
		
		double discount = getPrice()*percentage/100;
		
		setPrice(getPrice()-discount);
		
		System.out.println("Discount applied :"+discount);
		System.out.println("New Price :"+getPrice());
		}

		@Override
		public double calculateTax() {
			
			return getPrice()*8/100;
		}
		
		public double calculateShippingCost() {
			  return shippingWeight*5;
		}

		@Override
		public String toString() {
			return "Physical Product:\r\n"
					+ "Product Name:"+getName()+"\r\n"
					+ "Category:"+getCategory()+"\r\n"
					
					+ "Shipping Weight: "+shippingWeight+" kg\r\n"
					
			;
		}

		
		
		
}
