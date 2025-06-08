package com.krush.string_class_methods;

public class CompareToCompareToIngnoreCaseMethods {
	public static void main(String[] args) {
		
		
		
		String s1="krushna";
		String s2="krushna";
		String s3="Kunal";
		String s4="Sanjay";
		String s5="sanjay";
		
		
		//toCompare method to compare string character by character. they compare based on the UNICODE of one by one character.
		//there are three condition:
		//1) if the both String character matched then its return the Zero(0).
		
		
		System.out.println(" if the both String character matched then its return the Zero(0). s1==s2  :  "+ s1.compareTo(s2));//0
		
		
		
		//2) if the checking character if grater than subtraction is grater than 0 then s3>s2
		
		
		System.out.println("if the checking character if grater than subtraction is grater than 0 then s2>s3    s2>s3  :  "+s2.compareTo(s3));
		
		
		
		//3) if the checking character if grater than subtraction is smaller than 0 then s2<s3
		
		
				System.out.println("if the checking character if grater than subtraction is smaller than 0 then s2<s3 :   "+s3.compareTo(s2));
			
				
	   // compareToIgnoreCase()   its same as compare to but only its checking without case.
				
				
				System.out.println("s4==s5   :  "+s4+"  ==  "+s5+"  : > "+ s4.compareToIgnoreCase(s5));//0
				
	//based on the unicode comparison that is called as lexicographic comparison.
	}

}
