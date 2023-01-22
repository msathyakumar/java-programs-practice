package com.sathya.practice;

import java.util.Map;
import java.util.HashMap;
public class NoOfOccuranceInAString {
	
	public static void main(String[] args) {
		
		String s = "sssss eeeee kkkkk";
		Map<Character,Integer> curOccurance = new HashMap<>();
		
		for(char ch:s.toCharArray()) {
			if((curOccurance.containsKey(ch))) {
				curOccurance.put(ch, curOccurance.get(ch)+1);
			}else {
				curOccurance.put(ch,1);
			}
			
		}
		System.out.println(curOccurance.toString());
	}

}
