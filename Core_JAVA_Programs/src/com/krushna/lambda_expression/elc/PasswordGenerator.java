package com.krushna.lambda_expression.elc;

import java.util.Random;
import java.util.function.Supplier;

public class PasswordGenerator {

	public static void main(String[] args) {

		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String digits = "0123456789";
		String special = "@#$%!&*";

		String totalCharInPWD = upper + lower + digits + special;

		int pwdLength = 8;

		Supplier<String> passwordSupplier = () -> {

			String password = "";

			for (int i = 0; i < pwdLength; i++) {

				Random r = new Random();
				int num = r.nextInt(totalCharInPWD.length());

				password += totalCharInPWD.charAt(num);

			}
			return password;
		};

		System.out.println("Generated Password: " + passwordSupplier.get());
	}

}
