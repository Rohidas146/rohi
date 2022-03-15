package collection;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		
		LinkedList<String> obj=new LinkedList<String>();
		obj.addFirst("String first");
		obj.add("Testing");
		obj.addLast("Checking");
		obj.add("Testing");
		System.out.println(obj);

	}

}
