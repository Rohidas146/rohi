package StringPackage;

public class StringEqual {
	
	public static String var="A";
	public static String var1="A";
	public static String var3="a";

	public static void main(String[] args) {
	
		String var2=new String(" A ");
		
		System.out.println(var==var1); //true
		System.out.println(var==var2);
		
		System.out.println(var.equals(var1)); 
		System.out.println(var.equals(var2));

		System.out.println(var.compareTo(var1)); 
		System.out.println(var.compareTo(var2)); //65-65=0
		System.out.println(var.compareTo(var3)); //65-95=-32
		System.out.println(var3.compareTo(var2)); //95-65=32

		
}

}
