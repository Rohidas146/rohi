package com.practice;

//Write a Java Program to Swap two number without using third variable
public class SwappingWithoutUsingThirdVariable {

	public static void main(String[] args) {
		SwappingWithoutUsingThirdVariable obj=new SwappingWithoutUsingThirdVariable();
		obj.swap(10, 15);

	}

	private void swap(int a, int b) {
		System.out.println("Before Swaping value a and b is " + a + " " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swaping value a and b is " + a + " " + b);



	}

}
