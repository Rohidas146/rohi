package com.practice;

//Write a java Program to find the second-highest number in an Array.
import java.util.Arrays;

public class SecondHieghestNumber {

	
		public static int getSecondLargest(int[] a, int total){  
			Arrays.sort(a);  
			return a[total-2];  
	}  
			public static void main(String args[]){  
			int a[]={11,22,55,66,33,22};  
			  
			System.out.println("Second Largest: "+getSecondLargest(a,6));  
			
	}

}
