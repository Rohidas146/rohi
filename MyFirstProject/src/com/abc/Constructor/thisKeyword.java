package com.abc.Constructor;

public class thisKeyword {
  
	int a;
	int b;
	
	public void M1() {
		System.out.println(this);
	}
	
	public void M1(thisKeyword test) {
		System.out.println(test);
	}
	
	public static void main(String[] args) {
		thisKeyword obj=new thisKeyword(); // object name is obj
		System.out.println(obj); //reference id
		thisKeyword xyz=new thisKeyword(); // object name is xyz
        System.out.println(xyz);
        obj.M1();  //this ----obj
        xyz.M1();  //this ---xyz
        
        //we have two object and while calling m! we are using xyz 
        
	}

}
