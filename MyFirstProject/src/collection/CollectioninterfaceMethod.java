package collection;

import java.util.ArrayList;

public class CollectioninterfaceMethod {

	public static void main(String[] args) {
		
		ArrayList<Object> obj=new ArrayList<Object>();
		
		//this will add the string object
		obj.add("this is String");
		obj.add(2); //this will add integer object

		System.out.println(obj);
		
		ArrayList<Object> obj1=new ArrayList<Object>();
        obj1.add("New collection");
        System.out.println(obj1);
        
        //This method is used to add one collection in another collection
        obj.addAll(obj1);
        System.out.println(obj);
        System.out.println(obj1);
        
        obj.remove(1);
        System.out.println(obj);

        obj.removeAll(obj1);
        System.out.println(obj);

        obj.clear();
        System.out.println(obj);
        
        obj.add(4); //0
        obj.add(25); //1
        System.out.println(obj);
        
        System.out.println(obj.contains(4));
        
        //collection store objects
        // object come non-primitive
        // obj collection represent Object class Object
        // obj.get(0)----Integer type
        
        Object p=obj.get(0); // Homogeneous statement
        Integer t=(Integer) obj.get(0); // integer object
        System.out.println(t);
        
        //set
        obj.set(0, 24);
        System.out.println(obj);
	}

}
