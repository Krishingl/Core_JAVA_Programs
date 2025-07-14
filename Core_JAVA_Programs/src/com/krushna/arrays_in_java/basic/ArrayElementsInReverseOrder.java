package com.krushna.arrays_in_java.basic;

import java.util.*;
public class ArrayElementsInReverseOrder {

	public static void main(String[] args) 
{

Scanner sc = new Scanner(System.in);

		
		try(sc) {
		System.out.println("Enter the Array Size : ");
		
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		    for(int i=0; i< arr.length;i++){
			   
			   System.out.println("Enter the  index " + i + " element :" );
			   
			  arr[i] = sc.nextInt();
			   
			   
			   
			}
			System.out.println("Orignal Array : "+Arrays.toString(arr));
		    
			
			for(int i= arr.length-1;i>0 ;i--) {
				System.out.print(arr[i]+",");
			}
			System.out.print(arr[0]);
		       
	       }catch( ArrayIndexOutOfBoundsException|java.util.InputMismatchException e){
		     
			 System.out.println(e);
		   
		   }

		
		
}}
