package com.assignmentofIfElse;

public class LeapYearorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYearorNot obj=new LeapYearorNot();
	   obj.leapY(5098);
		obj.leapY(2004);
	}
   public void leapY(int y) {
	 if(y%4==0)
	 {
		 if(y%100==0)
		 {
			 if(y%400==0) 
			 {
				 System.out.println(y+ " is leap year");
			 }
			 else
				 System.out.println(y+ " is not leap year");
		 }
		 else
			 System.out.println(y+ " is leap year");
	 }
	 else
		 System.out.println(y+ " is not leap year");
	
   }
}
