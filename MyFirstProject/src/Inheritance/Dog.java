package Inheritance;

public class Dog extends Animal {
	
    Dog(){
    	this(5);
    	//super(); //super keyword is similar tothis() only difference it called parent class
    	// adding super is not mandatory if not added java will add it
    	System.out.println(" i am from dog class");
    }
	//Both this and super  should be on first line when you call in constructor
    Dog(int a){
    	this.a=a;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dog obj=new Dog();
        System.out.println(obj.a);
	}

}
