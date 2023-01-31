package com.sathya.day_28_01_2023;


public class BankingOneUsingORlex {
	
	public static void main(String[] args) {
		double balance = 2000;
		System.out.println("Enter amount to withdraw");
		double amount = 1000;
		if(amount<0  || amount>balance  ) {
			System.out.println("Withdraw has faild");
		}else {
			balance -=amount;
			System.out.println("Withdraw has succeded");
		}
	}

}
