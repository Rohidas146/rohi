package PatternPractice;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//i for row and j for column
		// row denotes the number of row you want to print
		int i,j,row= 6;
		
		//outer loop work for row
		for(i=0;i<row;i++) {
			//inner loop work for space
			for(j=row-i;j>1;j--) {
				//print space between two star
				System.out.print(" ");
			}
			   //inner loop for columns
			for(j=0;j<=i;j++) {
				//print star
				System.out.print("* ");
			}
			//throw the cursor in a new line after printing each line
			System.out.println();
		}
		
	}

}
