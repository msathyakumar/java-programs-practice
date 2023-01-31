package com.sathya.day_31_01_2023;

public class ContractEmployee extends Employee{
	
	private double wages;
	private int hours;
	
	public ContractEmployee() {
		super();
	}
	
	public ContractEmployee(double wages, int hours) {
		super();
		this.wages = wages;
		this.hours = hours;
	}


	public double getWages() {
		return wages;
	}


	public void setWages(double wages) {
		this.wages = wages;
	}


	public int getHours() {
		return hours;
	}


	public void setHours(int hours) {
		this.hours = hours;
	}


	public void calculateSalary() {
		
		
		double totalSalary = hours*wages;
		System.out.println("Contract Employee: Your Salary is "+totalSalary);
		
	}

}
