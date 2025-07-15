package com.krushna.arrays_in_java.basic;

public class ArraysCustomMethods {
	public static int sum(int[] arr) {
		int sum = 0;
		for (int x : arr) {
			sum += x;
		}
		return sum;

	}

	public static double avg(int[] arr) {

		double avg = sum(arr) / (double) arr.length;

		return avg;
	}

	public static int min(int arr[]) {
		int min=arr[0];
		
		
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i] ) {
	              min=arr[i];
			}
		}
		
		
		return min;

	}
	// max(int arr[]) method  its return the Maximum Value in the Given array
	public static int max(int arr[]) {
		int max=arr[0];
		
		
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i] ) {
	              max=arr[i];
			}
		}
		
		
		return max;

	}
}
