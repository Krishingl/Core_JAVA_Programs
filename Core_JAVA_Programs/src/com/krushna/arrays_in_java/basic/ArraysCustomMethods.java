package com.krushna.arrays_in_java.basic;

public class ArraysCustomMethods 
{
  public static int sum(int []arr)
  {     
	  int sum =0;
	  for(int x : arr) {
		   sum+= x;
	  }
	  return sum;
	 
	  
  }
	
  public static double avg(int []arr) 
  {
	  
	      double avg = sum(arr)/(double)arr.length;
	   
	  
	  return avg;
  }
		
	

}
