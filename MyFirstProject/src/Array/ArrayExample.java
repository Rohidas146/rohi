package Array;

public class ArrayExample {
	
	int a; // normal variable declaration
	static int b[]; //array declaration....single dimensional
	static int c[]= {1,2,3,4,5,6,7,8,9,10}; //declaration + initialization
	static int[]rollno;

	public static void main(String[] args) {
	
		
		//Initialization of array
		//arraymane=new datatype [size]
		b=new int[5];
        rollno=new int[100];
        // One approach to assign the value to array
        rollno[0]=1;
        rollno[1]=2;
        rollno[2]=3;
        rollno[3]=4;
        rollno[4]=5;
        
        //If you want to act smart please use for loop else first approach
        for (int i=0;i<100;i++) {
        	rollno[i]=i+1;
        }
        
        System.out.println("First studant of school " + rollno[0]);
        
        // array indexing start from zero so if you size is 100 then
        //last index of array should size 1==99
        
        System.out.println("Last admission in school "+ rollno[99]);
        
	}

}
