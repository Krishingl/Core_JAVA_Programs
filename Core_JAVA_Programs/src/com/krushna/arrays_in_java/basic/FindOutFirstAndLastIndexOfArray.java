package com.krushna.arrays_in_java.basic;

public class FindOutFirstAndLastIndexOfArray {

	public static void main(String[] args) {
		int[] arrs = { 10, 20, 30, 60, 20 };

		// Size/ length / number of elements in given array
		System.out.println("Size of Given Array Is : " + arrs.length);

		// First index
		System.out.println("The First index Of Array element is :" + arrs[0]);

		// Last Index
		System.out.println("The Last index Of Array element is :" + arrs[arrs.length - 1]);
	}

}
