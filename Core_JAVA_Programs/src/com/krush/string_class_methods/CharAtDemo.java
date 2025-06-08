package com.krush.string_class_methods;
import java.util.Scanner;
public class CharAtDemo {

	public static void main(String[] args)
	{
		System.out.println("Example:==> \"Java Devloper\" ");
		String s1="Java Devloper";
	
		char ch=s1.charAt(5);//D
		System.out.println("s1.charAt(5) is return the :=> "+ch);
		
		char ch2=s1.charAt(0);//J
		System.out.println("s1.charAt(0) is return the :=> "+ch2);
		System.out.println("______________________________________________________________________");
		
		System.out.println("Real time Example:==> Male or Female");
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		System.out.println("Enter your Gender : ");
		
		
		char gender = sc.nextLine().toLowerCase().charAt(0);
		  
		
		if(gender==('m')) {
			

			System.out.println("your gender is male ");
		}else 
			System.out.println("your gender is female ");
		
		
		
		
	sc.close();


       System.gc();
		
		
	}
	

}
