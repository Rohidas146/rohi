package StringPackage;

public class StringMethod {
     
	//var is storing string in UPPERCASE
	public static String var="TESTING";
	//var is storing string in lower case
	public static String var1="Testing";
	
	public static void main(String[] args) {
		
		//Length method need to use to check the length of a string
		//length calculation will start from 1
         System.out.println("length of a string" + var.length());
         
         // Tell me which the character at position within the string
         //ChatAt take one parameter that is index which start from 0
         // String var="Testing" so this indexing will be 0123456
         System.out.println("character at 2nd position " + var.charAt(2));
         
         //If we try to retrive character at position which is not present
         //then java will throw stringindexoutof bound exception
         //System.out.println(var.charAt(7));
         
         //Checking whether string is empty or not
         System.out.println("Checking whether string is empty or not " + var.isEmpty());
         
         //Checking whether string is equal or not using equals
         System.out.println("Checking whether both the string are equal  " + var.equals(var1));
       
         //Checking whether string is equal or not using equalignoreCase
         System.out.println("Checking whether both the string are equal  " + var.equalsIgnoreCase(var1));
       
         //Checking whether string is start with Tes
         System.out.println("Checking whether var is start with Tes  " + var.startsWith("Tes"));
       
         //var="TESTING"
         //from upper case to lower case
         System.out.println(var.toLowerCase());
         
         //var="testing"
         //from lower case to upper case
         System.out.println(var.toUpperCase());
         
         //Checking whether string is start with Tes
         System.out.println("checking whether var is startwith Tes" + var.toUpperCase().startsWith("tes"));
         // String Method chaining
         
         System.out.println(var.toLowerCase().endsWith("g"));
         
         String var2=var.toLowerCase();
         var2.startsWith(" tes ");
         
         // Concat method is use to join the two string
        String a=var.concat("software"); //Testing Software
         System.out.println(a); // String is immutable
         
         //JAVA CASE SENSITEVE so we are using to lower case first as var is in capital latter
         //contaion is using to check whether string contains particular value
         System.out.println("Checking whether string contains particular value" + var.toLowerCase().contains("Te"));
         
         String var1="Manual Tester";
         System.out.println(var1.replace("Manual","Automation"));
        
         //split return array of String
         // All will be return String
         //if you want to represent HOMOGENEOUS data type in one variable--->Array
         //Array stores the value in the form of index
         // we splint Manual Testing with space criteria ---[0] Manual [1] Tester
         //Split is use to divide the string but as java is machine we need to tell how 
         //in below problem we are asking java to split var21 with p as criteria
         String var21="Manual Tester Life Is Relax Only Pachage Is Problem";
         //Manual Tester Life Is Relax Only....>[0]
         //Package is .....>[1]
         //problem.....>[2]
         //split output will not content the word through which you are doing spliting 
         //like in this you are spliting using p
         System.out.println(var21.split("p")[0]);
        
         String var3="  Testing for space tarmination  ";
         System.out.println("String without trim" + var3);
         System.out.println("String with trim" + var3.trim());
       
         
         // Tell the difference between == , Equals and CompareTo 
         
         
         //String var="TESTING"
         //index of return type is int
         //As name suggest it will retrieve the index of particular string
         //If String is not found them it will return -1
         System.out.println(var.indexOf("N"));
         
         System.out.println(var.indexOf("84")); //Ascii value of A
         
         System.out.println(var.indexOf("T" , 2));
         
         
         System.out.println(var.lastIndexOf("T"));
         
         String var10=" This is long string for testing purpose only , nothing relation with program ";
         
         int i=var10.indexOf("long");
         System.out.println(var10.substring(i));
         
         System.out.println(var10.substring(8 , 12));
         
        
	}

}
