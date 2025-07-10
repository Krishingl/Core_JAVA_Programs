package com.krushna.exception_demo;

public class PrintStackTrace {

	public static void main(String[] args) {
     
		
		try {
			String str=null;
			System.out.println(str.toUpperCase());
		}catch(Exception e) {
			System.out.println(e.toString());//Return type String
			System.out.println(e.getMessage());//Return Type String
			e.printStackTrace();//Return Type String
		}

	}

}
