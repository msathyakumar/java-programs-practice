package com.sathya.ownexception.day3;
import java.util.ArrayList;
public class RemovingDuplicatesInArray {
	
	public static void main(String[] args) {
		
		int a[] = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8};
		int b[] = new int[16];
		// removing duplicates
		
		ArrayList<Integer> ar = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			if(!ar.contains(a[i])) {
			ar.add(a[i]);
			}
		}
		for(int k:ar) {
			System.out.print(k+",");
		}
		
		
		//replacing already existing values with default values
		
		for(int x=0;x<a.length;x++) {
			if(a[x]==5) {
				a[x]=10;
			}
		}
		for(int l:a) {
			System.out.println(l);
		}
			
		}
	

}
