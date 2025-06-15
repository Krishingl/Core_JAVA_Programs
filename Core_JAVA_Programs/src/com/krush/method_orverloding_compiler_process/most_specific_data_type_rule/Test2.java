package com.krush.method_orverloding_compiler_process.most_specific_data_type_rule;

import java.util.Scanner;

public class Test2 {
	
	
public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		
		Test2 t= Test2.class.newInstance(); 
		
		
		Scanner sc = new Scanner(System.in);
		
		t.accept();
		t.accept((char)12);
		t.accept(12);
		
	
		
		
		
	}
	
	
	
	public void accept(int... d)
	{
		
	System.out.println("int... ");
		
		
	}
	public void accept(char ...  d)
	{
		
		System.out.println("char");
		
		
	}
	

}
