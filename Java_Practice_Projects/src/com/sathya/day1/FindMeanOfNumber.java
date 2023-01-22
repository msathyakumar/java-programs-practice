package com.sathya.day1;

import java.util.Scanner;

public class FindMeanOfNumber {
	
	public static void MedianOfNumber(int[] ar,int n) {
		double sum=0;
		
		for(int a:ar) {
			sum +=a;
		}
		double mean = sum/n;
		System.out.println("Mean of given list is "+mean);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter the values");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		MedianOfNumber(ar,n);
		
		sc.close();
	}
}
