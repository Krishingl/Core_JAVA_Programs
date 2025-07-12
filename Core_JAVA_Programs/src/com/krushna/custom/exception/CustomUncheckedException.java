package com.krushna.custom.exception;

import java.util.Scanner;

//@SuppressWarnings("serial")
class GreaterMarksException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public GreaterMarksException() {
           
	}

	public GreaterMarksException(String errorMessage) {
		super(errorMessage);

	}

}

public class CustomUncheckedException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try (sc) {
			System.out.print("Enter Marks : ");
			int marks = sc.nextInt();
			validMarks(marks);

		} catch (GreaterMarksException e) {

			System.out.println(e.getMessage());
			System.out.println("======================================");
			System.out.println(e.toString());
			System.out.println("======================================");
			e.printStackTrace();
		}

	}

	public static void validMarks(int marks) {
		if (marks > 100) {
			throw new GreaterMarksException("Invalid Marks...");
		}
		System.out.println("Your marks is : " + marks);
	}
}
