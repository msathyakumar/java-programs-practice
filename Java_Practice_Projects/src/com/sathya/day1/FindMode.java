package com.sathya.day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class FindMode {

	public static void main(String[] args) {
		
		int [] a = {1,2,1,2,1,7,4,5,6,7,6,7,7,8,8,9,9};
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]);
			if(hm.containsKey(a[i])) {
				hm.put(a[i], hm.get(a[i])+1);
				//System.out.println(a[i]);
			}else {
				hm.put(a[i], 1);
				System.out.println(" a"+i+" s "+a[i]);
				
			}
		}
		
		
		int max_count = 0;
		int key =0;
		for(Map.Entry set:hm.entrySet()) {
			int value = (Integer) set.getValue();
			if(value>max_count) {
				max_count = value;
				key =(Integer) set.getKey();
				
			}
			
			//System.out.println("Key is "+set.getKey()+" \t And Value Is "+set.getValue());
		}
		
		System.out.println("Mode of a given array is "+max_count+" key is "+key);
		//System.out.println(hm);

		
	}

}
