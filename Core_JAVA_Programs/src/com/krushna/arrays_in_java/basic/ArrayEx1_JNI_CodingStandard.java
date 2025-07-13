//Program On the JNI coding Standerd.
package com.krushna.arrays_in_java.basic;

public class ArrayEx1_JNI_CodingStandard {

	public static void main(String[] args) {
		System.out.println("Primite Array datatype ------------->  JNI Classes");
		System.out.println("-----------------------------------------------------------------");
		// byte array , but if we write any array using primitive datatype then jvm are
		// provides internaly class that perticular datatype.
		// If we are creating array using byte primitive datatype then jvm internaly
		// provides one class its as [B and that B class Object are Created and loaded
		// into JVM memory inside HEAP AREA because its a Object.

		byte[] arr1 = new byte[3];

		// here we know internaly JNI classes are Wroking its Provided by JVM
		// And All the classes are exdending the Object Class And Implements from
		// Cloneable, Serializable (both are the Marker Interface)
		// That means in that all Classes Object Class Methods are Available

		System.out.println("byte array  \t\t\t\t " + arr1.getClass().getName());// [B

		// short array , but Object is created internaly for the [S class
		short arr2[] = new short[5];
		System.out.println("short array  \t\t\t\t " + arr2.getClass().getName());// [S

		// int array , but Object is created internaly for the [I class
		int arr3[] = new int[5];
		System.out.println("int array  \t\t\t\t " + arr3.getClass().getName());// [I

		// long array , but Object is created internaly for the [J class
		long arr4[] = new long[5];
		System.out.println("long array  \t\t\t\t " + arr4.getClass().getName());// [J

		// float array , but Object is created internaly for the [F class
		float arr5[] = new float[5];
		System.out.println("float array  \t\t\t\t " + arr5.getClass().getName());// [F

		// double array , but Object is created internaly for the [D class
		double arr6[] = new double[5];
		System.out.println("double array  \t\t\t\t " + arr6.getClass().getName());// [D

		// char array , but Object is created internaly for the [C class
		char arr7[] = new char[5];
		System.out.println("cahr array  \t\t\t\t " + arr7.getClass().getName());// [C

		// double array , but Object is created internaly for the [Z class
		boolean arr8[] = new boolean[5];
		System.out.println("boolean array  \t\t\t\t " + arr8.getClass().getName());// [Z

	}

}
