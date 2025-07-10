package com.krush.string_class_methods;

public class IndexOfMethod {
	public static void main(String args[])
	{  // The indexOf method only showing the Left to Right first occurrence of the given string or character index its returns.
		String str="Java is High level Proramming Language and is a OOPs language";
		
		int index=str.indexOf("a");
		System.out.println(str+" in that string index of  'a' is "+index);
		
		
		index=str.indexOf("is");
		System.out.println(str+" in that string index of  'is' is "+index);
		
	}

}
