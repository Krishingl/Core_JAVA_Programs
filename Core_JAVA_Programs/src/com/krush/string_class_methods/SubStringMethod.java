package com.krush.string_class_methods;

public class SubStringMethod {
	
	public static void main(String[] args) {
		
		String s1= "HYDERABAD";
		
		
		System.out.println(s1.substring(2));//DERABAD
		System.out.println(s1.substring(0,9));// its not consider 9 only 0 index to 8 index ==> HYDERABAD
		//System.out.println(s1.substring(0,10));//  java.lang.StringIndexOutOfBoundsException
		
		
		System.out.println(s1.substring(4,4));// not print any thing blank
		//System.out.println(s1.substring(-1,1));//  java.lang.StringIndexOutOfBoundsException
		
		//its return the specific part of String as user request.(based on the index)
	}

}
