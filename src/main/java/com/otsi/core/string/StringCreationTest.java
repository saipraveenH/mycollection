/**
 * 
 */
package com.otsi.core.string;

/**
 * @author praveen.hemadri
 *
 */
public class StringCreationTest {
	public static void main(String[] args) {
		/*
		 * String s1 = "hello"; String s2 = "world"; String s3; s1 = s1 + s2; s3 = s1;
		 * String s4 = new String("hello"); System.out.println(s1);
		 * System.out.println(s3);
		 */
		String str1 = new String("java8");
		String str2 = "java8";
		String str3 = new String(str2);
		String str4 = "java8";
		System.out.println(str1 == str2);
		str2 = "java14";
		System.out.println("Str2 : " + str2 + " Str3 : " + str3);
	}
}
