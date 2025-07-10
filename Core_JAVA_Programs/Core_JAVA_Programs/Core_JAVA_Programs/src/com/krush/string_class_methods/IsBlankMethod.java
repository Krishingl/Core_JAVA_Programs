package com.krush.string_class_methods;

public class IsBlankMethod {
	public static void main(String[] args) {
		
		

		String str="";
	
		System.out.println("str is empty here or not : "+str.isBlank());
		
		  str="  ";
		
		 System.out.println("str is empty here or not : "+str.isBlank());
		
		
		    
			str="\n";
			
			System.out.println("str is empty here or not : "+str.isBlank());
			
		   // System.out.println("String value is "+str +"But isEmpty() method showing its have value to solve this problem we have one method isBlank() from java 11 version" );
		
			str="NIT";
			
			System.out.println("str is empty here or not : "+str.isBlank());
			
		
	}

}
