package com.sathya.day_31_01_2023;

public class PermanentEmployee extends Employee {

	private double basicPay;
	private double hra;
	private int experience;

	public PermanentEmployee() {
		super();
	}

	public PermanentEmployee(String empId, String name, double salary) {
		super(empId, name, salary);
		// TODO Auto-generated constructor stub
	}

	public PermanentEmployee(double basicPay, double hra, int experience) {
		super();
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	
	
	public void calculateSalary() {
		double variableComponent =0;
		if(experience<3) {
			variableComponent=0;
		}else if(experience >=3 && experience <=5) {
			variableComponent=0.05*basicPay;
		}else if(experience >5 && experience <=10) {
			variableComponent=0.07*basicPay;
		}else if(experience>10) {
			variableComponent=0.1*basicPay;
		}else {
			variableComponent =0;
		}
		
		double totalPay = variableComponent+basicPay+hra;
		System.out.println("Permanent Employee: Your Salary is "+totalPay);

	}

}
