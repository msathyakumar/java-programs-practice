package com.sathya.day1;

import java.util.Scanner;

public class PalindromeOrNot {
	// palindrome check
	// 20/10/2022 Author M Sathya Kumar

	public static void stringPalindromeCheck(String mystr) {

		String s = new String(mystr);
		String n = "";
		for (int i = mystr.length() - 1; i >= 0; i--) {
			n += mystr.charAt(i);
		}
		if (s.equals(n)) {
			System.out.println("Given String is a palindrome");
		} else
			System.out.println("Given String is not a palindrome");
	}

	public static void numPalindromeCheck(int num) {

		int old_num = num;
		int new_num = 0;
		while (num > 0) {
			int rem = num % 10;
			new_num = new_num * 10 + rem;
			num = num / 10;
		}

		if (old_num == new_num) {
			System.out.println("Given Number " + old_num + " is a palindrome ");
		} else
			System.out.println("Given Number " + old_num + " is not a palindrome ");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number to check for palindrome");
		// int num = sc.nextInt();
		// numPalindromeCheck(num);
		// System.out.println("Enter String to Check palindrome");
		String st = sc.next();
		stringPalindromeCheck(st);
		sc.close();
	}

}
