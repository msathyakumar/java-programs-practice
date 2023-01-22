package com.sathya.day_22_01_2023;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams {
	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
		a.add("Allu Arjun");
		a.add("Arya");
		a.add("Happy");
		a.add("Arya 2");
		a.add("Ala Vaikuntapuramlo");
		a.add("Puspha");
		List<String> collect = a.stream().filter(alist->(alist.startsWith("A")||alist.endsWith("y"))).collect(Collectors.toList());
		collect.forEach(System.out::println);
		List<String> upperCaseList = a.stream().map(alist->alist.toUpperCase()).collect(Collectors.toList());
		upperCaseList.forEach(System.out::println);
		
		List<Integer> listValues = Arrays.asList(50,30,45,13,24,35,40,16,70);
		listValues.forEach(System.out::println);
		long count =listValues.stream().filter(marks->marks<36).count();
		System.out.println(count);
		
		
		
		
		
	}
	

}
