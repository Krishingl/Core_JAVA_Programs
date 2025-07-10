package com.krushna.interface_predefine_functions.supplier;
import java.util.function.Supplier;
public class SupplierDemo1 
{
public static void main(String[]args)
{
       	Supplier<Integer> s1=  ()-> 19;  //its a internaly inner anonymous class then after lambda expression 
       	
   
       	
       	
       	System.out.println("Supplier Functional InterFaceInside get() method  we are override using the lambda expression : "+s1.get());
       	
       	
       	
}
}
