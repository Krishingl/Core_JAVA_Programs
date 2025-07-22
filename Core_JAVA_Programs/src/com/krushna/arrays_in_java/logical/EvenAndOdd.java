package com.krushna.arrays_in_java.logical;

import java.util.Scanner;

public class EvenAndOdd {
	
	
	public static void main(String[] args) {
		   

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

          printEven(arr);
		
		    System.out.print("\n");  
		    printOdd(arr);
		  
		
		}catch(Exception e) {
			System.err.println("Array size should be Positve Integer Only..! ");
			
		}
		
		
		
	
	
		
		
		
	}
	
	public static final  void printEven(int ... arr)
	{     System.out.print("Even elements are : ");
		   for(int a : arr) {
			   if(a%2==0) {
				   System.out.print(" "+a);
			   }else {
				   continue;
			   }
		   }
	}
	public static final  void printOdd(int ...arr )
	{     System.out.print("Odd elements are : ");

		   for(int a : arr) {
			   if(a%2!=0) {
				   System.out.print(" "+a);
			   }else {
				   continue;
			   }
		   }
		
	}

}
