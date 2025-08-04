package com.java.stringbuffer_and_stringbilder_class_methods;

public class CheakThePerformanceBetweenStringBuliderAndStringBuffer {

	public static void main(String[] args) {
		// We need to help of System class to find the current System time in
		// miliseconds
		// System class have One Predefine method public static long currentTimeMillis()
		// its static method

		long startTime = System.currentTimeMillis();
		StringBuffer buffer = new StringBuffer("Hare");

		for (int i = 1; i < 1000000; i++)
		{
			buffer.append(" Krushna");
		}

		long endTime = System.currentTimeMillis();

		System.out.println("StringBuffer excution time : " + (endTime - startTime)+" ms");

		
		
		 startTime = System.currentTimeMillis();
		StringBuilder  builder= new StringBuilder("Hare");

		for (int i = 1; i < 1000000; i++)
		{
			builder.append(" Krushna");
		}

		endTime = System.currentTimeMillis();

		System.out.println("StringBuilder excution time : " + (endTime - startTime)+" ms");
      
		
	//OutPut:=>	
		/*
StringBuffer excution time : 55 ms
StringBuilder excution time : 15 ms
		 */
//now its clear StringBulider is Very fast as Compare to StringBuffer
	}

}
