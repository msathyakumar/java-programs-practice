package com.sathya.day1;

import java.util.Scanner;
import java.util.Arrays;

public class FindMedianOfANumber {

	public static void median(int[] ar, int n) {

		if (n % 2 != 0) {
			System.out.println("Median of the given array is " + ar[(n) / 2]);
		} else {
			int n1 = n / 2;
			double a = ar[n1];
			double b = ar[n1 - 1];
			System.out.println("a " + a + "b " + b);
			double d = (a + b) / 2;
			System.out.println("Median of the given array is " + d);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no of elements");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter the values");
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		Arrays.sort(ar);
		median(ar, n);

		sc.close();

	}

}
