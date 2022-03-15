package com.practice;

import java.util.*;
public class PalindromeNumber {
	

	public static void main(String[] args) {
		
    String str, reverse=""; //
    
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the String to find its palindrom or not");  
    str=obj.nextLine();
    
    for ( int i =str.length()-1; i >= 0; i-- )  
       reverse = reverse + str.charAt(i);  
    if (str.equals(reverse))  
       System.out.println(str+"palindrome");  
    else  
       System.out.println(str + "palindrome");   
 }  
    
	

}
