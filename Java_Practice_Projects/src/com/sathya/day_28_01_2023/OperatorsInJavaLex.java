package com.sathya.day_28_01_2023;

public class OperatorsInJavaLex {

	public static void main(String[] args) {
		
		// Arithmentic operatiors
		
		arithmetic();

	}

	public static void arithmetic() {
		
		//+ - % / % ++ --
		int a =10,b=20;
		System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
		System.out.println("Sub of "+a+" and "+b+" is "+(a-b));
		System.out.println("mul of "+a+" and "+b+" is "+(a*b));
		System.out.println("div of "+a+" and "+b+" is "+(a/b));
		System.out.println("mod of "+a+" and "+b+" is "+(a%b));
		++a;
		System.out.println("pre increment of a "+(a));
		System.out.println("post increment of a "+(a++));
		System.out.println("pre decrement of a "+(--a));
		System.out.println("post decrement of a "+(a--));

	}

	public static void assignment() {
		// = += -= /= *= %=

	}

	public static void bitwise() {
		//&|^ >> << >>> >>=

	}

	public static void logical() {
		
		// && || !

	}
}
