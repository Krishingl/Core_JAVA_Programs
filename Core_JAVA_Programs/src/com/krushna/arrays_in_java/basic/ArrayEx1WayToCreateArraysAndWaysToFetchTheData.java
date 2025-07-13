package com.krushna.arrays_in_java.basic;

import java.util.Arrays;

public class ArrayEx1WayToCreateArraysAndWaysToFetchTheData {

	public static void main(String[] args) {
		// Using new Keyword With Size

		int arr[] = new int[6]; // here size is Complsary
		// its most Common Way to create Array in java
		// But Size is Fixed AFTER DECLARATION WE CANNOT CHANGE THE SIZE OF ARRAY;
		// HERE BY DEFAULT ARRAY ELEMENTS ARE ZERO.
		// instializing the array elemets

		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		arr[5] = 600;
		// fetching the array elements /data using Ordnary for loop

		for (int i = 0; i < arr.length; i++) {
			System.out.println("element On the " + i + " Postion : " + arr[i]);

		}

		// Create a array by use ing Inline Intialization

		int[] arr2 = new int[] { 10, 20, 30, 40 };

		// fetch the elements one by one by using for-each Loop

		int i = 0;
		for (int data : arr2) {

			System.out.println(i + " Index postion element is : " + data);
			i++;
		}
		// here if obsever the second approch then we will find there code duplication
		// or redundency left side we are declare the datatype
		// then we are repite also declare same thing that is data type in the right
		// side.
		// to solve that problem we have Anonymous array concept

		// Anonymous Aarray using create array Object
 
		int[] arr3 = { 10, 30, 40 };

		// to print data in String Format Using toString(int [] arr) of Array class it
		// is a static final method inside a Array Class
		System.out.println(Arrays.toString(arr3));

	}

}
