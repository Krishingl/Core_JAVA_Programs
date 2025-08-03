package com.java.stringbuffer_and_stringbilder_class_methods;

public class ObjectComparison_String_StringBuffer_StringBuilder {

	public static void main(String[] args) 
	{
	        
		 StringBuilder sb1= new StringBuilder("Data");
		       
		          sb1.append("Base");
		        
		System.out.println("StringBuilder Its mutable means change the current Object : "+sb1); 
		          
		          
		   
				 StringBuffer sb2= new StringBuffer("I love My ");
				       
				          sb2.append("India");
				          
				System.out.println("StringBuffer Its mutable means change the current Object : "+sb2); 
				          
				      
		
				 String str= new String("I love My ");
			       
		          str.concat("Maharastra");
		          
		System.out.println("String Its Immutable means cannot change the current Object : "+str); 
		          
		      
//OUTPUT
/*
StringBuilder Its mutable means change the current Object : DataBase
StringBuffer Its mutable means change the current Object : I love My India
String Its Immutable means cannot change the current Object : I love My 
 */
		

	}

}
