package com.java.stringbuffer_and_stringbilder_class_methods;

public class Capacity_method_of_StringBuffer_Class
{
	public static void main(String[] args) {
		
		
		
		
		StringBuffer sb = new StringBuffer("Data");
		
		System.out.println("Before Modifing the string Capacity : "+sb.capacity());
		
		
		sb.append("Base khamgaon                                    ");
		
		
		System.out.println("After Modifing the string Capacity : "+sb.capacity());
		
		
		
	}

}
