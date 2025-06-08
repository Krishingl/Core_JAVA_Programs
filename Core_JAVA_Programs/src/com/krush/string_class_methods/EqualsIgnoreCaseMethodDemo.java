package com.krush.string_class_methods;

public class EqualsIgnoreCaseMethodDemo {

	public static void main(String args[]) {
		String s1 = "Krushna";
		String s2 = "krushna";

		String s3 = new String("KrusHnA");

		System.out.println("s1==s2 ( '=='its compare the reference and memory address) : " + (s1 == s2));
		System.out.println(
				"s1.equals(s2) (this method are check the object content withcase, here A and a are not equals )"
						+ s1.equals(s2));

		System.out.println(
				"s1.equalsIngnoreCase(s2) (this method are check the object content withoutcase, here A and a are  equals )"
						+ s1.equalsIgnoreCase(s2));

		System.out.println(
				"s1.equalsIngnoreCase(s3) (this method are check the object content withoutcase, here A and a are  equals )"
						+ s1.equalsIgnoreCase(s3));

		System.out.println(
				"s2.equalsIngnoreCase(s3) (this method are check the object content withoutcase, here A and a are  equals )"
						+ s2.equalsIgnoreCase(s3));

	}

}
