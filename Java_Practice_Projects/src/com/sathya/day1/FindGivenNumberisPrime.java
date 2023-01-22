package com.sathya.day1;

import java.util.Scanner;

public class FindGivenNumberisPrime {
	// to check given number is prime or not
	// Author M Sathya Kumar 20/10/2022

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbet to check Prime :");
		// Enter the number to check for Prime

		int num = sc.nextInt();
		int flag = 1;
		if (num == 1) {
			flag = 0;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					flag = 0;
					break;
				}
			}
		}
		if (flag == 1) {
			System.out.println("Given Number " + num + " is Prime Number");
		} else {
			System.out.println("Given Number " + num + " is Non Prime Number");
		}
		sc.close();
	}

}
