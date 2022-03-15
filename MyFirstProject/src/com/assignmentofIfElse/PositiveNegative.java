package com.assignmentofIfElse;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositiveNegative obj=new PositiveNegative();
		obj.pn(3);
		obj.pn(-2);
	}
   public void pn(int a) {
	if(a>0)
		System.out.println(a+ " is positive");
	else
		System.out.println(a+ " is negative");
   }
}
