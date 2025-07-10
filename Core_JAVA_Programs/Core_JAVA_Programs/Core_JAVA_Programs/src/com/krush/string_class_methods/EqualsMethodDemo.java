package com.krush.string_class_methods;

public class EqualsMethodDemo {
	public static void main(String args []) {
		
		
		//note :  '==' its are compare the memory address and object reference only its never check the content of object.
		
		
		// other hand, equals(Object obj) its takes the object as argument and compare the object content return IF its equal then return true if not equals return false its never check the reference.
		
		
	//Example : 
		
		
		
		String s1 = "Ram";

	
		String s3 = new String("Ram");
		
		System.out.println(" s1==s2 "+(s1==s3));//because of it checked the address .
		
		
		System.out.println(" s1.equals(s3) "+s1.equals(s3)); //its checked the content of object.
		
	}

}
