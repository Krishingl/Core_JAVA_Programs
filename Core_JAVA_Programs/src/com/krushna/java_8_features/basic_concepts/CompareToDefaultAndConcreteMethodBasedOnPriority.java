package com.krushna.java_8_features.basic_concepts;
//Priority Comparison between default method and Concrete Method:
interface A{
	
	default void m1() {
		System.out.println("Default Method");
	}
     
}
 class B{
	 
	 
	 public void m1() {
		 System.out.println("Concrete Method");
		 
		 
	 }
 }
 
 
 
 
// 
// class Result  implements A extends B{  // here compiler Error because we must me write the exrends first because class has more priority as compare to  interface
//	 
// }
 
 
 class Result  extends B implements A
 {
	 //here its ok work and its we can call the method to createing object of Result class 
 }
public class CompareToDefaultAndConcreteMethodBasedOnPriority  
{
	public static void main(String args[])
	{
		
		Result c1= new Result();
		c1.m1();
		
		
		
	}
	
	

}
