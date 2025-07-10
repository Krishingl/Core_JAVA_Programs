package com.krushna.interface_predefine_functions.function;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionDemo1 {

	// Find the Cube Of number
	public static void main(String args[]) {

		Function<Integer, Integer> fn1 = num -> num * num * num;

		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		System.out.println("Cube of Given number is : " + fn1.apply(Integer.valueOf(num)));
		sc.close();
	}

}
