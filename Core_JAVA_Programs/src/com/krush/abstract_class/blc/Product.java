package com.krush.abstract_class.blc;

public abstract class Product {

	private  String name ;
	private  double price ; 
	private  String category;
	public Product(String name, double price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		
	}
		public abstract void applyDiscount(double percentage);
		public abstract double calculateTax();
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
	
	
	
	
}
