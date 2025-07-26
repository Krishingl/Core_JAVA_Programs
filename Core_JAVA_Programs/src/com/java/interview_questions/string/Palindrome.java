package com.java.interview_questions.string;

public class Palindrome {

	public static void main(String[] args) {
		  String str = "madamm";
		  
		Boolean flag=true;
		  for(int i=0;i<str.length();i++)
		  {      
			    if(str.charAt(i)!= str.charAt(str.length()-i-1)) {
			    	flag=false;
			    }
			
		  }
		  
		  if(flag) {
			  System.out.print("P");
		  }
		  
	}

}
