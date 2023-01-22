package com.sathya.day1;

import java.util.Scanner;

public class EvenOrOdd {
	// day1 program1
	public static void main(String[] args) {
		// input the value to find even or odd
		// M Sathya Kumar 20/10/2022 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check Even Or Not : ");
		int num = sc.nextInt();
		if (num >= 0) {
			if (num % 2 == 0) {
				System.out.println("Given Number " + num + " is Even");
			} else {
				System.out.println("Given Number " + num + " is Odd");
			}
		} else {
			System.out.println("Number should be greater than 0");
		}
		sc.close();

	}

}
