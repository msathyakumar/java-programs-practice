package com.sathya.day1;

import java.util.Scanner;

public class PrintNPrimeNumbers {
	// print N primenumbers
	// M Sathya Kumar 20/10/2022 oct 20

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of prime numbers you want : ");
		int num = sc.nextInt();
		
		for (int i = 2; i < num; i++) {
			int flag = 1;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {

					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				System.out.println(i);
			}

		}

		sc.close();
	}

	public void test() {
		int num = 0;
		int flag = 1;
		for (int i = 0; i < num; i++) {
			for (int j = 2; j < i; j++) {
				System.out.print(i);
				if (i % j == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(i);
			}

		}
	}
}
