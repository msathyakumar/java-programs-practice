package com.sathya.day_28_01_2023;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexJava {
	
	public static void main(String[] args) {
		String match = "hello World";
		
		Pattern p = Pattern.compile("^[\\w\\s]*$");
		Matcher m = p.matcher(match);
		boolean find = m.find();
		System.out.println(find);
	}

}
