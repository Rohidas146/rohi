package StringPackage;

import System.ScannerExample;

public class StringDeclaration {
	
     //String declaration
	public static String var;
	public StringDeclaration var1;
	public int var3=3;//literal integer
	
	//string initialization can two ways
	
	//A. by using literal
	    // String a="abc";
	//B. By using new object
	     //String b=new String (abc);
	public static void main(String[] args) {
		
		var=new String("Rohidas ");
       System.out.println(var);
       String a="Test"; //Declaration and initialized the string
       String p=var.concat("patil"); //Rohidas + Patil
       System.out.println(p);
       // String is immutable once you created then You can't modify
       
       StringBuffer obj=new StringBuffer("Rohidas ");
       obj.append("patil");
       System.out.println(obj);
	}

}
