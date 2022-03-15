package collection;

import java.util.Stack;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector<String> obj=new Vector<String>();
		obj.addElement("String");
		Stack<String> obj1=new Stack<String>();
        obj1.push("Testing"); //Collection Add
        obj1.push("Second");
        obj1.add("Three");
        
        //Either we print all the elements
        System.out.println(obj1);
        obj1.pop();  //Delete
        // We access specific objec/elements
        System.out.println(obj1.get(1));
        System.out.println(obj1);
	}

}
