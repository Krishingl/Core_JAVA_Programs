package com.krush.string_class_methods;

public class IsEmptyMethod {
	
	
	public static void main(String args[])
	{
		String str="";
		boolean isEmpty=str.isEmpty();
		System.out.println("str is empty here or not : "+isEmpty);
		
		  str="  ";
		  isEmpty=str.isEmpty();
		 System.out.println("str is empty here or not : "+isEmpty);
		
		
		    str="NIT";
			isEmpty=str.isEmpty();
			System.out.println("str is empty here or not : "+isEmpty);
			
			str="\n";
			isEmpty=str.isEmpty();
			System.out.println("str is empty here or not : "+isEmpty);
			
		    System.out.println("String value is "+str  +"But isEmpty() method showing its have value to solve this problem we have one method isBlank() from java 11 version" );
		
		
		
		
		
		
		
	}

}
