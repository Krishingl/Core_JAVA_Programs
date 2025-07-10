package com.krushna.exception.blc;

public class ParentClass 
{
   public void loadingClass(String className) throws ClassNotFoundException 
   {
	   Class.forName(className);
	   System.out.println("Class "+className+" loaded successfully.");
   }
}
