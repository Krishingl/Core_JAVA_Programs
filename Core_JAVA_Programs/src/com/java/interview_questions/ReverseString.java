package com.java.interview_questions;

public class ReverseString {

	public static void main(String[] args) 
	{     
	
	      String str = "Welcome to Java";
		    
			String []words =str.split(" ");
			       
			    for(int i=0; i < words.length/2;i++){
			        String temp = words[i];
			              words[i]=words[words.length-i-1];
			              words[words.length-i-1]=temp;
			        
			        
			    }
			
			        String reverse = String.join(" ",words);
			        
			        System.out.print(reverse);
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	

