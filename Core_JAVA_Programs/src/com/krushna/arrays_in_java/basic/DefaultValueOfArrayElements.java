package com.krushna.arrays_in_java.basic;

public class DefaultValueOfArrayElements {

	public static void main(String[] args) {

		int[] arr = new int[5];
		System.out.print("int Array Default Value Size is 5 : ");
		for (int element : arr) {
			System.out.print(element);
		}
		System.out.println();
		char[] arr2 = new char[5];
		System.out.print("boolean Array Default Value Size is 5 : ");
		for (char element : arr2) {
			System.out.print(element + " space"); // blank(space) //32 <=assci code
		}

		System.out.println();
		boolean[] arr3 = new boolean[5];
		System.out.print("char Array Default Value Size is 5 : ");
		for (boolean element : arr3) {
			System.out.print(element);
		}

		System.out.println();
		float[] arr4 = new float[5];
		System.out.print("float Array Default Value Size is 5 : ");
		for (float element : arr4) {
			System.out.print(element);
		}
		System.out.println();
		double[] arr5 = new double[5];
		System.out.print("double Array Default Value Size is 5 : ");
		for (double element : arr5) {
			System.out.print(element);
		}
		System.out.println();
		String[] arr6 = new String[5];
		System.out.print("double Array Default Value Size is 5 : ");
		for (String element : arr6) {
			System.out.print(element);
		}
	}

}
