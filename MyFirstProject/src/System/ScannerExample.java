package System;

import java.util.Scanner;

public class ScannerExample {

	//to take value from console
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Please let me know which value i need to check for odd/even");
	Scanner obj=new Scanner(System.in);	
     int var=obj.nextInt();
     if(var%2==0) {
    	 System.out.println(var + " number is even ");
     }
     else {
    	 System.out.println(var + " number is odd ");
     }
     System.out.println("please enter string value ");
     String var3=obj.next();
     System.out.println(var3);
     System.out.println("please enter string value for nextline ");
     String var4=obj.nextLine();
     System.out.println(var4);
	
	}

}
