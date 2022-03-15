package com.assignmentofIfElse;

public class LargesNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=9;
    int b=8;
    int c=6;
    if((a>b) && (a>c))
    	System.out.println(" a is greater than b and c ");
    else
    	if((b>c) && (b>a))
        	System.out.println(" b is greater than c and a ");
        else
           if((c>b) && (c>a))
            System.out.println(" c is greater than b and a ");
            
	}
    
}
