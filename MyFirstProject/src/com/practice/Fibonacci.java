package com.practice;

//Write a java Program for the Fibonacci series
public class Fibonacci {

	public static void main(String[] args) {
		
		int i=2,s=10,a=0,b=1,t=0;	 // decl and initialization i
	//	int s=10;  // initialized to print no. of terms of fibonacci series
		//int a=0;
		//int b=1;
		//int t=0;
		
	   for(i=1; i<=s; i++) { 
		  System.out.print(t+ " " ); 
		  a=b;
		  b=t;
		  t=a+b; // addition of current and previous no.
	   }

	}

}
