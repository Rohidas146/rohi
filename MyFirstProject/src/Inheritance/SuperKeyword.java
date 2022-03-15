package Inheritance;


class Bike{
	int a;
	
	public void M1() {
		System.out.println(" i am from parent ");
	}
}

public class SuperKeyword extends Bike {
    int a;
    
    SuperKeyword(int a){
    this.a=a; //child class /current class instance variable
    super.a=a; // parent class instance variable
    super.M1(); // it will call parent class M1
    this.M1(); //this will call child class M1
    }
    
    public void M1() {
    	System.out.println(" i am from child class ");
    }
    
public static void main(String[] args) {
		SuperKeyword obj=new SuperKeyword(4);
        obj.M1();
 
	}

}
