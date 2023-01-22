package com.sathya.day1;

import java.util.Scanner;

public class ArmstrongNumCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num to check Armstrong num");
		int num = sc.nextInt();
		int old_value = num;
		int new_value =0;
		while(num>0) {
			int rem = num%10;
			new_value = rem*rem*rem+new_value;
			num =num/10;
		}
		if(old_value==new_value)System.out.println("Given number "+old_value+" is armstrong Number");
		else System.out.println("Given number is "+old_value+" not armstrong number");
		sc.close();

	}

}
