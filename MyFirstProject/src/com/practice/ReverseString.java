package com.practice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		String string = "I am rohidas";
		String reversedStr = "";
		
		for(int i=string.length()-1; i>=0; i--){
			reversedStr = reversedStr + string.charAt(i);
			
		}
		//System.out.println("original string " + string);
	   
		System.out.println(" " + reversedStr);
	}

}
