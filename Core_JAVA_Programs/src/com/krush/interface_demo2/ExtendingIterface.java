package com.krush.interface_demo2;



interface A{
	
	
    void m1();
}


interface B extends A{
	
	   void m2();
	//here by defualt m1() is available
}



class C implements B{
	
	
	
	public void m1() {
		System.out.println("hello i am m1");
	}
	
	public void m2() {
		System.out.println("hello i am m2");
	}
	
}

public class ExtendingIterface {
	
	
	public static void main(String[] args) {
		C c=new C();
		
		
		c.m1();
		c.m2();
	}
	
	

}
