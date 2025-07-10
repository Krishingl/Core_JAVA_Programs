package com.krush.wrapper_classes.valueof_methods;

public class AutoBoxingValueOfMethod {
	
	
	public static void main(String[] args) {
		  
		
		int i =100;
		
		Integer integer =Integer.valueOf(i);//method   1
		
		
		Integer i1 = Integer.valueOf("100");// method 2
		
		int k = Integer.parseInt("1234");
		
		System.out.println(i+""+integer+"    "+i1  +"    "+k);// method 2
		
		
		Integer i2= Integer.valueOf("111",35);
		
		
		
		System.out.println(i2);
		
		
		   
		
	}

}
