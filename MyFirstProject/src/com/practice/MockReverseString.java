package com.practice;

//Example for Reverse the String using While Loop

public class MockReverseString {

	public static void main(String[] args) {

    String s="Test Data Hello World",revs="";		
    
   // System.out.println("Before Reverse String is " +s);
	int i=s.length()-1;
	while(i>= 0)
	{
		 
		   		revs=revs+s.charAt(i);
			  
			   i--;

	}
	 System.out.println(" " + revs);

	}

}
