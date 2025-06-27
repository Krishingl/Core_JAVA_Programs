package com.krushna.interface_predefine_functions;

import java.util.Scanner;
import java.util.function.Predicate;

public class NumberIsEvenOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Predicate<Integer> pd = num -> num % 2 == 0;

		System.out.print("Enter The number : ");

		int num = sc.nextInt();
		System.out.println("Given numeber " + num + " Is even ? " + pd.test(num));

		sc.close();
	}

}
