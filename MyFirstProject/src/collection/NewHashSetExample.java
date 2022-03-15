package collection;

import java.util.HashSet;

public class NewHashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> obj=new HashSet<String>();
		
		obj.add("First icecream");
		obj.add("Second icecream");
		obj.add("Third icecream");
		obj.add("First icecream"); //duplicate object ....it will overwrite the existing object
		System.out.println(obj);
		System.out.println("I am coping obj collection in another collection");
		//Explicit casting----Non primitive 
		HashSet<String> obj1=(HashSet<String>) obj.clone();
		System.out.println(obj1);
		obj.remove("Second icecream");
		System.out.println(obj);
		System.out.println(obj1);
	}

}
