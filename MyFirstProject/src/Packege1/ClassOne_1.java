package Packege1;

public class ClassOne_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassOne obj=new ClassOne();// creating object of ClassOne to check how access modifier work 
		obj.D=4.4f;
		System.out.println("value of D is " + obj.D);
		obj.P=5.5f; // P is protected
		obj.R=5; // R is public
		//obj.B='a'; as B is private , so we can not access it in another class
	}
	

}
