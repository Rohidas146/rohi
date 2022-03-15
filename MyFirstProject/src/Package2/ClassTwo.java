package Package2;

import Packege1.ClassOne;

public class ClassTwo
{
	
public int A;
private float B1;
protected char C;
          float F;
          
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	 
        ClassTwo obj=new ClassTwo();
   ClassOne abc=new ClassOne(); 
        abc.R=2;
       // abc.P=2.2f; P is protected
       // abc.B='p'; B is private
        //abc.D=2.5; D is default
}
}