package com.krushna.arrays_in_java.logical;

import java.util.Scanner;

public class AddFirstAndLastElementOffArray {

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


		System.out.print("Result is : "+(arr[0]+arr.length-1));
		               
		
		
		}catch(Exception e) {
			System.err.println("Array size should be Positve Integer Only..! ");
			
		}
		
		
		
	}
	
   
}
