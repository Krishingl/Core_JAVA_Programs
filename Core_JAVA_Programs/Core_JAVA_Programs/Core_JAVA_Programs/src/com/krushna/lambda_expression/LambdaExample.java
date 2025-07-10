package com.krushna.lambda_expression;

import java.util.Scanner;

@FunctionalInterface
interface Predictable {

	boolean Predict(Integer num);

}

//Write a Program take user input and check its illigible for voting or not
public class LambdaExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your Age : ");
		Integer ag = Integer.parseInt(sc.nextLine());

		Predictable pred = age -> age >= 18;

		System.out.println(" Is person illegible are Voteing ? " + pred.Predict(ag));

		sc.close();
	}

}
