package com.practice;

public class RemoveAllspace {

	 
	    public static void main(String[] args) {  
	          
	        String str="India is my Country";  
	          
	        //Removes the white spaces using regex  
	        str = str.replaceAll("\\s+", "");  
	          
	        System.out.println("String after removing all the white spaces : " + str);  
	    }  
	}  