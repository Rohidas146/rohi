package com.practice;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		int a,b;
		System.out.println("Enter values of a and b");
		Scanner obj=new Scanner(System.in);	
		a=obj.nextInt();
		b=obj.nextInt();
		System.out.println("addition of a and b is " + (a+b));
	}
}
