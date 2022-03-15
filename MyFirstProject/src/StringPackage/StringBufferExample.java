package StringPackage;

public class StringBufferExample {

	//StringBufferExample---programmer cha class
	//StringBuffer---> java cha class
	public static void main(String[] args) {
		// To get access of string buffer we need to create object
		
		// object with no parameter constructor
		StringBuffer str=new StringBuffer();
		System.out.println(str.length());
        
		// object with string as parameter constructor
		StringBuffer obj=new StringBuffer("This is for Testing ");
		System.out.println(obj.length());
		
		//StringBuffer specific method
		//Append----Append the new string in existing string
		//For example if you want to append int value use append (int) method
		//You have many append methods based on which is have to append you can
		System.out.println(obj.append(34567890));
		System.out.println("this is string after delete " + obj.append(true));
		
		//delete will delete the string of specific index
		System.out.println("this is string after delete " +  obj.delete(0, 10));
		
		//deletecharAt will delete specific character
		System.out.println("Final string after delete char at" +  obj.deleteCharAt(0));
		
		
		System.out.println(obj.insert(5, "Example"));
		
		//replace=delete + insert
		System.out.println(obj.replace(0, 10, "String"));
		
		System.out.println(obj.reverse());
	}

}
