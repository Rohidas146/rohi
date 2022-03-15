package com.practice;

// example for selection shorting in char

public class ShortigForChar {

	public static void main(String[] args) {
		
		char[] a= {'a','a','b','a','b','b','a','b'};
		char b;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]>a[j]) {
					
					b=a[i];
					a[i]=a[j];
					a[j]=b;
		}
				
		}
			System.out.print(" " +a[i]);
		}

	}

}
