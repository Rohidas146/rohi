package com.SwitchAssignment;

public class SimpleCalculator {

	
		
	public static void main(String[] args) {
		
	char var='+';
	int a=1;
	int b=2;

	switch(var) {
	
	case '+':
		System.out.println(" addition of a and b is " + (a+b));
		break;
	case '-':
		System.out.println(" substraction of a and b is " + (a-b));
		break;
	case '*':
		System.out.println(" multiplication of a and b is " + (a*b));
		break;
	case '%':
		System.out.println(" modulus of a and b is " + (a%b));
		break;
	case '/':
		System.out.println(" division of a and b is " + (a/b));	
		break;
	}	
		
	}
}
	


