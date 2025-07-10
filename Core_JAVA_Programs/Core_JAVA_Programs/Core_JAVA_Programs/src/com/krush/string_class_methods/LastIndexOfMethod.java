package com.krush.string_class_methods;

public class LastIndexOfMethod {
	public static void main(String[] args) {
		//the lastIndexOf method is finds the Last means (Right to left First) Occurrence and that will 
		String str="Oracal is DBMS tool its Use to Store our day to day Transtion data/Information"
				+ "its support to sql language to communicate our data base.";
		
		int lastIndex=str.lastIndexOf("language");
		System.out.println(str+"lastIndex of \"language\" is : "+lastIndex);
		
		
		System.out.println("Total lenght of String is : "+str.length());
		
		
		
		
		
		
	}

}
