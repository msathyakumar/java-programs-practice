package com.sathya.day_28_01_2023;

public class TypeCastingInLex {
	
	public static void main(String[] args) {
		//Widening conversion
		widening();
		//narrowingConversion
		
		narrowingConversion();
		
	}
	public static void widening() {
		int i = 100;
		double j ;
		j = i;
		System.out.println("The value of j is "+j);
	}
	
	public static void narrowingConversion() {
		double d = 10.123;
		int i ;
		i =(int)d;
		System.out.println("The value of i is "+i);
		
	}

}
