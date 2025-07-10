package com.krushna.exception.elc;

import com.krushna.exception.blc.ChildClass;

public class Tester {

	public static void main(String[] args) {
	 ChildClass c=new ChildClass();
	 try(c){
		for(String className : args) 
		{
         c.loadingClass(className);
		}
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	 
	
	}
	

}
