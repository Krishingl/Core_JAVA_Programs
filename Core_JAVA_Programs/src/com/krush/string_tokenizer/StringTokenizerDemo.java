package com.krush.string_tokenizer;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args)
	{
		String str = "Hyderabad is an IT city";
		
		//it is teken by two argument as a parameters one is String and second is deleter means where we want split
		StringTokenizer st = new StringTokenizer(str," ");
		
		
		
		System.out.println("Token number of tokens :"+ st.countTokens());//it will return the token count
		
		System.out.println("Has More Tokens in given string  : "+st.hasMoreTokens());//true
		
		
		System.out.print("Tokens are : ");
		while(st.hasMoreTokens())
		{
			System.out.print(st.nextToken()+" , ");
		}
		
		System.out.println();
		System.out.println("Has More Tokens in given string  : "+st.hasMoreTokens());//false
		
		
		
		
		
	}

}
