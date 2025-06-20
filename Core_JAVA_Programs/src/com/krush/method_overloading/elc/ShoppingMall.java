package com.krush.method_overloading.elc;

import java.util.Scanner;

import com.krush.method_overriding.blc.*;


public class ShoppingMall {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		  
		int cType= sc.nextInt();
	   
		    switch(cType){


                case 1:  
                  String name = sc.next();
                  GeneralCustomer gc= new GeneralCustomer(name);
                    int item=sc.nextInt();
                   String names[]=new String[item];
                    double prices[]=new double[item];
                    for(int i=0;i<item;i++){
                          names[i]=sc.next();
                          prices[i]=sc.nextDouble(); 
                    
                    
                
                    }
                       generateBill(gc, 
                       prices);
                    break;
                   case 2:





            }


		
		
		
		
	}
        public static void generateBill(Customer cust, double... prices) {

                cust.calculateBill(prices);
          
        	
        }
}


//public class ShoppingMall {
//	
//	public static void main(String[] args) {
//		
//		Scanner sc= new Scanner(System.in);
//		
//		
//	   
//		
//		
//		
//		
//		
//	}
//        public static void generateBill(Customer cust, double... prices) {
//        	
//        }
//}


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

