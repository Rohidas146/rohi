package collection;

import java.util.ArrayList;

public class LifeWithoutGeneric {

	public static void main(String[] args) {
		
		ArrayList t=new ArrayList();
		t.add(1);
		t.add("String");
		
       System.out.println(t);
       
       String p=(String) t.get(0);
      
	}

}
