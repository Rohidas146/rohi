package com.practice;

//write a java Program to Swap two number using third variable
public class SwappingUsingThirdVariable {

	public static void main(String[] args) {
		
		SwappingUsingThirdVariable obj=new SwappingUsingThirdVariable();
		obj.swap(2, 4);

	}

	private void swap(int a, int b) {
		System.out.println("Before Swaping value a and b is " + a + " " + b);
		int c;
		c=a;
		a=b;
		b=c;
		
		System.out.println("After Swaping value a and b is " + a + " " + b);

	}

}
