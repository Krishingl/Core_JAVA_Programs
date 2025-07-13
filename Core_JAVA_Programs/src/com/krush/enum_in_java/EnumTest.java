package com.krush.enum_in_java;

enum Color//it is similer to class Because .class file genreted by java compiler 
{     //1. Every enum its internaly extended by the java.lang.Enum means we can extend to another class 
	// 2. Every enum  its internaly  public and final, its final then we can not inhirate that enum class to another class
	//3. enum extends java.lang.Enum ,the Enum is the absract class thats implements . 
	
	
	  // Enum inside declare variable is public static  final its type of enum its Reference Variable  its internaly create Object by using java Compiler   
	BLACK,BLUE,RED,GREEN;  //EVREY ENUM first line reservd for enum constant only
	
//	BLACK(""),BLUE(""); //HERE SEMICOLON IS OPTIONAL

 Color(){ 
	 
	 //if we are loaded the enum in the jvm how many enum constat we have that many time its constructor Working

		System.out.println("hello");   
		  
	}
 
 
	
}
public class EnumTest {
  public static void main(String[] args) {
	System.out.println("Enum Constant : "+Color.BLACK);// why here we are writeing the Color because its by defaut satic and final varible 
	System.out.println("Enum Constant : "+Color.BLACK);
	System.out.println("Enum Constant : "+Color.values());
	System.out.println("Enum Constant : "+Color.values());
	
	Color [] colors= Color.values();
	for(Color color : colors) {
		System.out.println(color);
	}
	
}
}
