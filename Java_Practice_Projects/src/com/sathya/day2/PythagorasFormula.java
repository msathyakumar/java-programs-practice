package com.sathya.day2;

import java.util.Arrays;
import java.lang.Math;
public class PythagorasFormula {
	
	public static void checkPythagoran(int[] a) {

		
		Arrays.sort(a);
		for(int i:a) System.out.println(i);
		double side1 = Math.pow(a[0], 2);
		double side2 = Math.pow(a[1], 2);
		double side3 = Math.pow(a[2], 2);
		if(side1+side2==side3) System.out.println("Pythagoras Theorem Satisfied");
		else System.out.println("Pythagoras Theorem Not Satisfied");
	}
	public static void calculateHypothesas(int side1,int side2) {
		double hypothesis = Math.sqrt(Math.pow(side1, 2)+Math.pow(side2,2));
		System.out.println("The third side is "+hypothesis);
	}
	public static void main(String[] args) {
		int a[] = {4,3,5};
		checkPythagoran(a);
		calculateHypothesas(3, 4);
		calculateHypothesas(3, 5);
		calculateHypothesas(3, 7);
		calculateHypothesas(5, 2);
		
	}

}
