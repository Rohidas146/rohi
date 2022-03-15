package com.assignmentofGenerel;

public class Swaping
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
   Swaping obj=new Swaping();
   obj.swap(2, 4);
   obj.swapUsingAddSub(8, 10);
   obj.swapUsingMultDiv(12, 14);
	}
    public void swap(int f, int g) {
    System.out.println(" before swapping value of f and g is "+ f+" "+g );
    int h;
    h=f;
    f=g;
    g=h;
    System.out.println(" after swaping value of f and g is " +f+" "+g );    	
    } 
    public void swapUsingAddSub(int f, int g) {
    System.out.println(" before swapping value of f and g is "+ f+" "+g );
    f=f-g;
    g=f+g;
    f=g-f;
    System.out.println(" after swaping value of f and g is " +f+" "+g);
    }
    public void swapUsingMultDiv(int f, int g) {
        System.out.println(" before swapping value of f and g is "+ f+" "+g );
        f=f*g;
        g=f/g;
        f=f/g;
        System.out.println(" after swaping value of f and g is " +f+" "+g);
        }
}    
