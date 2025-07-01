package com.krushna.interface_predefine_functions.function;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionDemo3 {
	// find given String having "@gamil.com" or not?
	public static void main(String args[]) {
		Function<String, Boolean> fn1 = (str) -> str.contains("@gmail.com");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Email Id : ");
		String emailId = sc.next();

		System.out.println("Is EmailId  Correct ? " + fn1.apply(emailId));

		sc.close();

	}

}
