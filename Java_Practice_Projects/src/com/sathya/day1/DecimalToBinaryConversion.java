package com.sathya.day1;

import java.util.Scanner;

public class DecimalToBinaryConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Decimal Number to Convert to Binary :");
		int decNum = sc.nextInt();
		String st ="";
		while(decNum>0) {
			int rem = decNum%2;
			st+=String.valueOf(rem%2);
			decNum /=2;
			
		}
		for(int i=st.length()-1;i>=0;i--) {
			System.out.print(st.charAt(i));
		}
		
		sc.close();
	}

}
