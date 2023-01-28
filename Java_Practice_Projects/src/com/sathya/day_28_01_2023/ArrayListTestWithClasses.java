package com.sathya.day_28_01_2023;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTestWithClasses {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		addValues(names);
		names.forEach(System.out::println);
	}

	private static void addValues(List<String> names) {
		names.add("sathya");
		names.add("google.com");
		names.add("hello world");
		ArrayListTestWithClasses a = new ArrayListTestWithClasses();
		List<String> movies = a.getMovies();
		movies.forEach(System.out::println);
		
	}
	
	private List<String> getMovies(){
		List<String> myStr = new ArrayList<>();
		mynewValues(myStr);
		return myStr;
	}
	
	private void mynewValues(List<String> n) {
		n.add("18 pages");
		n.add("Veera simha reddy");
		n.add("Valtheru veerayya");
	}
	
	
	

}
