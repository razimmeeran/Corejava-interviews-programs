/**
 * 
 */
package coreJavaPackage;

/**
 * Create a Pyramid Program using for loop
 *
 */
public class ReversePyramidProgram {

	public static void main(String[] args) {
		
		int Row = 6;	
		int i,j;
		for(i = 0;i<Row;i++)
		{		
			for(j =0;j<Row-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
			for(j=i+1;j>0;j--)
			{
				System.out.print(" ");
				
			}
		}

		

	}

}
