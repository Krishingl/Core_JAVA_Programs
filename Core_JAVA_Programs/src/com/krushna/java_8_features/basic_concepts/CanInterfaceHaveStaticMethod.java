package com.krushna.java_8_features.basic_concepts;


//before jdk 1.8 version its not suported  now java 8 version  interface support the static methods and default method.

interface K
{
	
	public static void m1() {
		System.out.println("interface A static method");
	}
	
	
	
}




class Test implements K
{
	public static int m1() {
		System.out.println("Test Class Static method ");
		
		
		return 10;
	}
	
	
}

class KK extends Test
{
//	public static long m1() {
//		System.out.println("interface A static method");
//		
//		
//		return 10;
//	}
	//if we are change the return type of static meythod inside class then its show error
	//rather than if we change the return type of static method inside of the interface then it not show error its not available in the implimenter classes
	
	
}



public class CanInterfaceHaveStaticMethod {
	
	
	public static void main(String[] args)
	{
		
		K.m1();//we can call only static method using interface name.
		
		Test.m1();
	}

}
