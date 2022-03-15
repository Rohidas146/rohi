package Exception;

public class GarbageCollector {

	static GarbageCollector obj;
	
	public static void main(String[] args) {
		// Making object eligible for garbage collector by making object unreachable
		obj=new GarbageCollector();
		obj=null; //obj is not reachable
		
		//Markig object eligible for garbage collector by pointing one reference to another 
		  GarbageCollector obj1=new GarbageCollector(); 
		  GarbageCollector obj2=new  GarbageCollector(); 
		  obj2=obj1;
		  
		 	System.gc();//It is only request it doesn't mean JVM will call garbage collector 
			Runtime.getRuntime().gc();
			System.out.println("testing");
			
			
	}
	
	//final ,finally and finalize 
	//Overriding the finalize method so that it will get called by GC before deleting the object
	@Override
	protected void finalize() throws Throwable {
		System.out.println("I am finalize");
	}
	
	public void M2() {
		
	}

}