package com.SwitchAssignment;

public class NumberEvenorOdd {

	public static void main(String[] args) {
		// to check whether number is odd or even

		int abc=13;
		
		// abc%2==0  even
		
		switch(abc%2) { //if (abc%2==0) boolean
		
		case 0 :
			 System.out.println(abc+"  is even number");
			 break;
		default : 
		    System.out.println(abc+" is odd number");
		}
		}

	
}
