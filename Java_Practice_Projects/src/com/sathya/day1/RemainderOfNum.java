package com.sathya.day1;

import java.util.Scanner;

public class RemainderOfNum {
	// find remainder of a given number
	// 20/10/2022
	// M Sathya Kumar

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to Find Remainder");

		int number = sc.nextInt();
		if (number >= 0) {
			System.out.println("The Remainder of a given number is " + (number % 2));
		} else {
			System.out.println("Number should be greater than 0");
		}
		sc.close();

	}

}
