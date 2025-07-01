package com.java.interview_questions;

public class FindTheLargestNumberBetweenThreeNumber {
	
	
	public static void main(String args[])
	{
		
		int n1=80;
		int n2=1000;
		int n3=30;
		  
	
		System.out.println(n1>n2&&n1>n3?n1:n2>n3?n2:n3);
		
		if(n1>n2&&n1>n3) {
			System.out.println("The largest number is : "+n1);
		}else  if(n2>n3)
		{
			System.out.println("The largest number is : "+n2);
		}else
		{
			System.out.println("The largest number is : "+n3);
		}
		
		
		
		int largest = (n1>n2) ? ((n1>n3)?n1:n2): (n2>n3)? n2:n3;
		System.out.println("The largest Number is : "+largest +" Third way");
	}

}
