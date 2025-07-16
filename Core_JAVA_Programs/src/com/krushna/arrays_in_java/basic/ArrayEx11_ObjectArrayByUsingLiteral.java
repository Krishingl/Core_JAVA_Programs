package com.krushna.arrays_in_java.basic;

import java.util.Arrays;
public class ArrayEx11_ObjectArrayByUsingLiteral {

	public static void main(String[] args) 
	{
		Object []obj = {12,12.4f,'m',"Krushna",191D,12L,17,1,2,3};
	   
		
		//how to print the hetrogeneous  type of data 
		System.out.println("Printing Hetrogeneous  type of data"+Arrays.toString(obj));
		
		
		int int_sum=0;
		
		for(int i=0 ;i<obj.length;i++) {
			
			if(obj[i] instanceof Integer) {
				Integer ii=((Integer)obj[i]);
				int_sum+=ii.intValue();   //manual Boxing  Wrapper -- to primetive
			}
			
			
//			Arrays.sort(obj); //ClassCastException
		}
	
		System.out.println("The of Integer In the Given Array is :"+int_sum);
	
	}

}
