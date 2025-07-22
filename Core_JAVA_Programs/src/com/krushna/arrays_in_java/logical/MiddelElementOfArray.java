package com.krushna.arrays_in_java.logical;

import java.util.Scanner;

public class MiddelElementOfArray {
	
	
	public static void main(String[] args) {
		   

		Scanner sc =new Scanner(System.in);
		System.out.print("Enter array elements separated by space: ");
		
		String [] input= sc.nextLine().split(" ");
		 int[] arr = new int[input.length];
		  for(int i=0; i<input.length;i++)
		  {
			  arr[i]=Integer.parseInt(input[i]);
		  }
		
		  
		  
		  int length= arr.length;
		  
		  if(length/2==1) {
			  System.out.println("Middle Element : "+arr[length/2]);
		  }else
		  {
			  System.out.println("Middle Element : "+arr[(length/2)-1] +" "+arr[length/2]);
		  }
		  sc.close();
	}
}
