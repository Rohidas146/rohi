package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationExample {

	public static void main(String[] args) {

		Vector<String> obj=new Vector<String>();
		obj.add("First icecream");
		obj.add(1,"Second icecream");
		obj.addElement("Third icecream");
		
		Enumeration<String> enumeration =obj.elements();
		
		// enumeration is holding total three object
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
			
		}
		System.out.println("Iteration through iterator interface-------");
		Iterator<String> iteratorobj=obj.iterator();
		
		while(iteratorobj.hasNext()) {
			System.out.println(iteratorobj.next());
			iteratorobj.remove();
		}
		System.out.println(obj);
	}

}
