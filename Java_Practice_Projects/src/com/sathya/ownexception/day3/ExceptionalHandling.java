package com.sathya.ownexception.day3;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class ExceptionalHandling {

	public static void main(String[] args) throws Exception{
		
		int x =0;
		int y =1;
		if(x==0) {
			throw new UnKnownValueException("x must have valid number");
		}
		//int z = y/x;
		FileReader f = new FileReader("employee.csv");
		/*
		try {
		FileReader f = new FileReader("employee.csv");
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		*/
		
		try {
			int a=1;
			int b=1;
			int c = b/a;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}
}
