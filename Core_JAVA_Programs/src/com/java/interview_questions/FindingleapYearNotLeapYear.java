package com.java.interview_questions;

public class FindingleapYearNotLeapYear {

	public static void main(String[] args) {
          
		int leapYear=-1
				
				;
		
	
		
		if(leapYear<=0) {
			System.err.println("Invalid Year..!");
		}
		else
		if(leapYear%4==0 && (leapYear%100!=0 || leapYear%400==0))
		{
			System.out.println("leap year");
			
		}else
		{
			System.out.println("not a leap year input");
			
		}

	}

}
