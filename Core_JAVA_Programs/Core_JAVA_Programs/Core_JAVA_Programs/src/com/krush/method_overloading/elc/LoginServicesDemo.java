package com.krush.method_overloading.elc;

/**
           Login Services:
         
         1) email login 
         2) mobile number
         3) provider Login ( example :==> google platform)
 */
import java.util.Scanner;

import com.krush.method_overloading.blc.LoginServices;

public class LoginServicesDemo {
	public static void main(String[] args) {

		LoginServices ls = new LoginServices();

		Scanner sc = new Scanner(System.in);

		System.out.println("-------------::::---Login Services---::::------------");
		System.out.println("         1) email login \r\n" + "         2) mobile number\r\n"
				+ "         3) provider Login ( example :==> google platform)");
		System.out.println("\n---------------------------------------------------\n---------------------------------------------------");

		System.out.print(" Enter Your Login Option : ");
		int choice = Integer.parseInt(sc.nextLine());
		switch (choice) 
		{
		case 1:
			System.out.println(" Your Selected Email login ");
			System.out.print(" Enter Email Id : ");
			String emailId = sc.nextLine();
			System.out.print(" Enter PassWord : ");
			String password = sc.nextLine();
			ls.login(emailId, password);
			break;
		case 2:
			System.out.println(" Your Selected Mobile Number login ");
			System.out.print(" Enter Mobile Number : ");

			String mobileNo = sc.nextLine();
			System.out.print(" Enter OTP  Number : ");

			int OTP = Integer.parseInt(sc.nextLine());
			ls.login(mobileNo, OTP);
			break;
		case 3:
			System.out.println(" Your Selected Provider Platform based login ");
			System.out.print(" Enter  Platform Provider : ");

			String provider = sc.nextLine();

			ls.login(provider);

			break;
		default:
			System.err.println("Select Correct Option...!");

		}
		sc.close();

	}
}
