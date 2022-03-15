package com.assignmentofGenerel;

public class Greaterthan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greaterthan obj=new Greaterthan(); //create object
		obj.greaterthan(11 , 10); //call method by object
	}

	public void greaterthan(int a, int b)  // create instance method
	{
	if(a<b) //checking if b is greater than a
	{ 
		System.out.println("b is greater than a");
	}
	else 
		 if(a>b) // checking a is greater than b 
		  {
		  System.out.println("a is greater than b ");
		  }
	 }
	
	
    }
