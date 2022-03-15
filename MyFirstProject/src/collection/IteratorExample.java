package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		
	ArrayList<String> obj=new ArrayList<String>();
	//All object are type String
    obj.add("First"); //first object
    obj.add("Second"); // second object
    obj.add("Third");
    obj.add("Fourth");
    obj.add("Fifth");
    
	//If i want to print all the object of collection within in one goal
    System.out.println(obj);
    
    // If i want to access specific object
    String var=obj.get(1);
    
    
    //get(0)
    //get(1)
    
    
    //Performing lower case operation on second object 
    System.out.println(var.toLowerCase());
    
    //when you have to do some operation across the collection
    
    Iterator iterator=obj.iterator();
    
    while(iterator.hasNext()) { //false
    	System.out.println(iterator.next()); //obj.get(0)
    }
    
    System.out.println("--------old style-------");
    
    for(int i=0;i<obj.size();i++) {
    	System.out.println(obj.get(i));
    }
	}

}
