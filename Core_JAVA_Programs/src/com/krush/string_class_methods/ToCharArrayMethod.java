package com.krush.string_class_methods;


public class ToCharArrayMethod {
	
	
	public static void main(String[] args)
	{
		
		
		//toCharArray is use to Split the String into character Arrays
		String str = "Hello World";
		
		
		char []characters = str.toCharArray();
//System.out.println(characters);


for(char character : characters )
{
	System.out.print(character+",");//H,e,l,l,o, ,W,o,r,l,d,
}
		
	}
}
