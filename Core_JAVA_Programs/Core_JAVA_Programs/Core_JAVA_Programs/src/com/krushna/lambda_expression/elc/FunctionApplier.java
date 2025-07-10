package com.krushna.lambda_expression.elc;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionApplier {

	public static void main(String[] args) {
		// Function<T,R> it is FunctionalInterFace it have one method abstract method
		// that is apply(T) it take the T type As Parameter And retrun R type of return
		// value
		Function<String, Integer> getStringLength = (str) -> str.length();

		Function<Integer, Double> divideAndFormat = (num) -> num / 2.0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String  :");
		String str = sc.nextLine();
		System.out.print("Enter Number  :");
		int num = sc.nextInt();

		System.out.println(" String Length is " + getStringLength.apply(str));// here we are pasing the primitive but
																				// our accept method is wrraper type
																				// then its is autoBoxing

		System.out.println("Result of dividing " + num + " by 2.5 :  " + divideAndFormat.apply(num));// here we are
																										// pasing the
																										// primitive but
																										// our accept
																										// method is
																										// wrraper type
																										// then its is
																										// autoBoxing

		sc.close();

	}

}
