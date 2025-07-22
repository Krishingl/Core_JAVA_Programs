package com.krushna.arrays_in_java.logical;

import java.util.Scanner;

/*
 * 
 * Search for a given Element in an Array if present then print
"Element found at index : ", if not present print "Element not found"

Input as: 1 4 3 5 2 6 5
Enter searching element: 5
Output: Element found at index 3

Input as: 1 4 3 5 2 6
Enter searching element: 7
Output: Element not found
  

 */


public class ElementSurching {
	
	
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
		System.out.print("Enter the surching Element : ");
		
		int surchElement=  sc.nextInt();
		
		surchElement(surchElement,arr);
		
		
		}catch(Exception e) {
			System.err.println("Array size should be Positve Integer Only..! ");
			
		}
		
		
		        
	
	

	}
	
	
	public static void surchElement(int surchElement,int ...arr) 
	{
		
		boolean flag=false;
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==surchElement) {
				System.out.println("Element found at index :"+i);
				flag=true;
				break;
				
			}
			
		}
		if(!flag) {
			
			System.err.println("Element is not found..!");
		}
		
	}
	
	

}
