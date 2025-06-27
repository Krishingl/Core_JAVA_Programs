package com.krushna.interface_predefine_functions;

import java.util.Scanner;

import java.util.function.Predicate;

public class FindPersonIligibleForVoteingOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Predicate<Integer> pd = age -> {
			return age > 18;

		};
		// Predicate<Integer> pd2= age-> age >18;

		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();

		System.out.println("Is person is illegible for voteing? " + pd.test(age));
		sc.close();
	}

}
