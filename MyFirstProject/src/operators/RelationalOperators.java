package operators;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    RelationalOperators obj=new RelationalOperators();
    obj.greaterthanequalto(10, 2);
    obj.Lessthanequalto(2, 10);
    obj.notequalto(2, 10);
    obj.greaterthane(2, 4);
    obj.Lessthane(3, 4);
    obj.equalto(3, 4);
	}
   public void greaterthanequalto(int a,int b) {
	System.out.println("a is greater than equal to b ?" + (a>=b)); //10>=2
	
}
   public void Lessthanequalto(int a,int b) {
		System.out.println("a is less than equal to b ?" + (a<=b)); //2<=10
   }	
   
   public void notequalto(int a,int b) {
		System.out.println("a is not equal to b ?" + (a!=b)); //2!=10
  }	   
   public void greaterthane(int a,int b) {
		System.out.println("a is greater than b ?" + (a>b)); //2>4
  }	
   public void Lessthane(int a,int b) {
		System.out.println("a is less than b ?" + (a<b)); //3<4
  }	
   public void equalto(int a,int b) {
		System.out.println("a is equal to b ?" + (a==b)); //3==4
  }	
}
