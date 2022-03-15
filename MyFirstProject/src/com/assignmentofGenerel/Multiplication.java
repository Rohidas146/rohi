package com.assignmentofGenerel;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     float a=17f; // float value created and initialized
     float b=98f;
     float c=a*b; // multiplication of a and b stored in c
     System.out.println(" multiplication of two floating point " + c); // print multiplication
      
     Multiplication obj=new Multiplication(); // create object
     obj.patil(1.2f, 2.1f); // method patil call by object obj
	}
	public float patil(float r, float p) { // method create
		  System.out.println("multiplication of two floating point" + (r*p));
		return p;
		  
	}
}
