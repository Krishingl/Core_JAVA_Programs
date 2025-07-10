package com.krush.method_overriding.blc;

public class Customer {

	protected String name;

	public Customer(String name) {
		if (name.isBlank()) {
			System.out.println("00");
		}

		this.name = name;
	}

	public void calculateBill(double... prices) {
		double totalPrice = 0;
		for (double price : prices) {

			if (price < 0) {

				System.out.println("Error");

				System.exit(0);

			} else {

				totalPrice += price;

			}

		}
		
		System.out.println("Welcome to Hyderabad Mall  :\r\n"
				+ "		Customer: "+name+"\r\n"
				+ "		Total cost RS : "+totalPrice+"\r\n"
				+ "		Discount: No discount for general customers.\r\n"
				+ "");

	}

}

class GeneralCustomer extends  Customer {

	public GeneralCustomer(String name) {
		super(name);
		
	}
	    
	@Override
	public void calculateBill(double... prices) {
		double totalPrice = 0;
		for (double price : prices) {

			if (price < 0) {

				System.out.println("Error");

				System.exit(0);

			} else {

				totalPrice += price;

			}

		}
		
		System.out.println("Welcome to Hyderabad Mall  :\r\n"
				+ "		Customer: "+name+"\r\n"
				+ "		Total cost RS : "+totalPrice+"\r\n"
				+ "		Discount: No discount for general customers.\r\n"
				+ "");

	}


	
	
	
	
}




class PrimeCustomer extends  Customer {
	
	
	protected double discountRate = 10.0; 

	public PrimeCustomer(String name) {
		super(name);
		
	}
	    
	@Override
	public void calculateBill(double... prices) {
		double totalPrice = 0;
		for (double price : prices) {

			if (price < 0) {

				System.out.println("Error");

				System.exit(0);

			} else {

				totalPrice += price;

			}

		}
		
		System.out.println("Welcome to Hyderabad Mall  :\r\n"
				+ "		Customer: "+name+"\r\n"
				+ "		Total cost RS : "+(totalPrice) +"\r\n"
				+ "		Discount RS : "+totalPrice*discountRate/100+"\r\n"
				+ "Final amount RS :"+(totalPrice+totalPrice*discountRate/100)
				
				);

	}


	
	
	
	
}



class VIPCustomer extends  Customer {
	
	
	protected double discountRate = 15.0; 

	public VIPCustomer(String name) {
		super(name);
		
	}
	    
	@Override
	public void calculateBill(double... prices) {
		double totalPrice = 0;
		for (double price : prices) {

			if (price < 0) {

				System.out.println("Error");

				System.exit(0);

			} else {

				totalPrice += price;

			}

		}
		
		System.out.println("Welcome to Hyderabad Mall  :\r\n"
				+ "		Customer: "+name+"\r\n"
				+ "		Total cost RS : "+(totalPrice) +"\r\n"
				+ "		Discount RS : "+totalPrice*discountRate/100+"\r\n"
				+ "Final amount RS :"+(totalPrice+totalPrice*discountRate/100)
				
				);

	}


	
	
	
	
}






