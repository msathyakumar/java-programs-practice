package com.sathya.day_31_01_2023;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		PermanentEmployee p = new PermanentEmployee(10000,1500,3);
		p.setName("Anil");
		p.setEmpId("101");
		p.calculateSalary();
		
		ContractEmployee c = new ContractEmployee(500, 10);
		c.setName("Ankit");
		c.setEmpId("102");
		c.calculateSalary();
		
	}

}
