package com.assignmentForLoop;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int i=2;	 // decl and initialization i
	int s=10;  // initialized to print no. of terms of fibonacci series
	int a=0;
	int b=1;
	int t=0;
	
   for(i=1; i<=s; i++) { 
	  System.out.print(t+ " " ); 
	  a=b;
	  b=t;
	  t=a+b; // addition of current and previous no.
   }
	}

}
