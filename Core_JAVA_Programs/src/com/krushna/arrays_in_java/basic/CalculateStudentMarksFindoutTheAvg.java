package com.krushna.arrays_in_java.basic;
import java.util.Scanner;

import java.util.Arrays;
import java.util.InputMismatchException;


@SuppressWarnings("unused")
public class CalculateStudentMarksFindoutTheAvg {

	public static void main(String[] args) 
	{
          
		Scanner sc = new Scanner(System.in);
		try(sc){
	    System.out.print("Enter the Total Subjects : ");
		int totalSubjects= sc.nextInt();	
		
		int [] subjects= new int[totalSubjects];
		
		for(int i=0 ; (i < subjects.length) ;i++)
		{
			  System.out.print("Enter the "+(i+1)+" Subject Marks : " );
			  subjects[i]=sc.nextInt();
			  
			
		}
		
		  
		   int totalMarks=ArraysCustomMethods.sum(subjects);
		   System.out.println("Total Marks is : "+totalMarks);
	       double average = ArraysCustomMethods.avg(subjects);
	       System.out.println("Average is  : "+average);
	     
	     
	    
		}catch(InputMismatchException ex) 
		{
			System.err.println(" Enter proper Marks In integer format only ");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}catch(ArrayStoreException e)
		{
			System.err.print("invalid Value Storing ");
		} catch (NegativeArraySizeException e) {
			System.err.println("Array Size Must Be Positive Integer");
		}
		
	//int sum= Arrays.stream(new int[]{10,20,10}).sum(); //Stream API java 8
	

	}

}
