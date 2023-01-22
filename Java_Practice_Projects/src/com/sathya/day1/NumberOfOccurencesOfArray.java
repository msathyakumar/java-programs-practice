package com.sathya.day1;

import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurencesOfArray {
	
	public static void main(String[] args) {
		
		String s = "Hello ! Sathya Good Morning";
		char c[] = s.toCharArray();
		HashMap<Character, Integer> findOccurences = new HashMap<Character, Integer>();
		
		for(int i=0;i<c.length;i++) {
			if(findOccurences.containsKey(c[i])) {
				findOccurences.put(c[i], findOccurences.get(c[i])+1);
			}
			else {
				findOccurences.put(c[i], 1);
			}
		}
		for(Map.Entry entry :findOccurences.entrySet()) {
			System.out.println("The Key "+entry.getKey()+" Repeated "+entry.getValue()+" times");
		}
	}

}
