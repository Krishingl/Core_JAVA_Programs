package com.krushna.arrays_in_java.logical;

import java.util.Scanner;

public class ReverseOrderArray {
	
	
	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		try(sc){
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		
		int arr[]= new int[size];
		
		
		for(int i=0;i<size ;i++){
			System.out.print("Enter the array elements  at  " +(i+1)+" Position : ");
			sc.nextLine();
		arr[i]= sc.nextInt();
			
		}
		
		
		 getReverse(arr);
		
		               
		
		
		}catch(Exception e) {
			System.err.println("Array size should be Positve Integer Only..! ");
			
		}
		
		
		
	}
	public static void getReverse(int ...arr) 
	{      
		System.out.print("Reverse Number is : ");
		for(int i=arr.length-1;i>=0 ;i--) 
		{
			
			System.out.print(" "+arr[i]);
			
		}
		
	}
   
}
