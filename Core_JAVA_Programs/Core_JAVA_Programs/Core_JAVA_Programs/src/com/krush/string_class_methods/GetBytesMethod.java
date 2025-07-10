package com.krush.string_class_methods;

import java.util.Arrays;

public class GetBytesMethod {

	
	public static void main(String args[])
	{
		String str = "adcdef";
		byte[] bytes=str.getBytes();
		
		System.out.println("The Binary format (unicode) of the '"+str+"' is :"+Arrays.toString(bytes));
		
		
	}
	
}
		
		
		