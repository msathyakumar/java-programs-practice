package com.sathya.ownexception.day3;
import java.util.Arrays;
public class SortArray {
	
	public static void main(String[] args) {
		
		
		// using sort method in Arrays
		
		int []a = {1,2,5,4,6,7,6,5,4,3,2};
		Arrays.sort(a);
		for(int x:a) {
			System.out.print(x+" ");
		}
		//decending order
		System.out.println();
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		
		int []b = {1,2,5,4,6,7,6,5,4,3,2};
		
		
		// selection sort 
		
		// Sorting without using sort method ascending
		for(int k=0;k<b.length;k++) {
			int index = k+1;
			for(int l=k+1;l<a.length;l++) {
				if(b[k]<b[l]) {
					int temp = b[k];
					b[k]= b[l];
					b[l]=temp;
				}
			}
		}
		for(int q:b) {
			System.out.print(q+" ");
		}
		System.out.println("decending order");
		
		for(int k=0;k<b.length;k++) {
			int index = k+1;
			for(int l=k+1;l<a.length;l++) {
				if(b[k]>b[l]) {
					int temp = b[k];
					b[k]= b[l];
					b[l]=temp;
				}
			}
		}
		for(int r:b) {
			System.out.print(r+" ");
		}
				
		}
	}

