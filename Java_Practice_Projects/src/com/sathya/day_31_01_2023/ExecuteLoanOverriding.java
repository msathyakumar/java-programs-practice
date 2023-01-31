package com.sathya.day_31_01_2023;

class Loan1 {
	public double calculateEMI(double principal) {
		double simpleInterest = (principal * 8.5 * 5) / 100;
		return (simpleInterest + principal) / 5;
	}
}

class HomeLoan extends Loan1 {
	// method overriden
	public double calculateEMI(double principal) {
		int additionalTax = 200;
		double simpleInterest = (principal * 7.5 * 20) / 100;
		double emi = (simpleInterest + principal) / 20;
		return emi + additionalTax;
	}
}

class VehicleLoan extends Loan1 {
	// method overriden
	public double calculateEMI(double principal) {
		int additionalTax = 200;
		double simpleInterest = (principal * 9.5 * 10) / 100;
		double emi = (simpleInterest + principal) / 10;
		return emi + additionalTax;
	}
}

public class ExecuteLoanOverriding {
	public static void main(String[] args) {
		Loan1 loan = null;
		loan = new HomeLoan(); // Runtime Polymorphism
		double hloan = loan.calculateEMI(2000000);
		loan = new VehicleLoan(); // sup class reference holding sub class Object
		double vloan = loan.calculateEMI(100000);
		System.out.println("Home loan emi per year is..." + hloan);
		System.out.println("Vehicle loan emi per year is..." + vloan);

	}

}
