package com.krush.string_class_methods;

public class SplitMethod {
   public static void main(String[] args) {
	//split method is a string class method that is use to split the existing string  
	   //on the base  String regex (regex means expression) format.
	   
	   //its return the String Array
	   
	   
	   String str="regex means expression wich and spliting Indigater";
	   
	   
	   String [] words=str.split(" "); //here white space means regex.
	   
	   //we want print the array then use the for each loop
	   
	   
	   for(String word : words)
	   {
		   
		   System.out.println(word);
	   }
	   System.out.println("===============================================================");
	   
 words=str.split("i"); //here white "i" regex.
	   //here split all the words base on the "i" regex.
	   //we want print the array then use the for each loop
	   
	   
	   for(String word : words)
	   {
		   
		   System.out.println(word);
	   }
	   
	   
	   
	   
	   
	   
}
}
