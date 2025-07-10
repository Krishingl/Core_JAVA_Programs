package com.krush.method_overloading.tests;

public class Test {
	
	
	public void m1(String q,Integer b) {
		
		System.out.println("String q,Integer b");
		
	}
	public void m1(String b,int q) {
		
		System.out.println("String - int");
		
	}
	
	public static void main(String args[]) {
		
		
		Test t= new Test();
		t.m1(null
				,
				  Integer.valueOf(0)
				);
		
	}

}


abstract class math{
	abstract  void m1();
	abstract int m1(int a);
}
class maths extends math{
public void m1() {}
   protected 	int  m1(int a) 
   {
		return 0;
	}
	
}