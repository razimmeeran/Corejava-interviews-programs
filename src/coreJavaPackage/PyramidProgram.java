/**
 * 
 */
package coreJavaPackage;

/**
 * Create a Pyramid Program using for loop
 *
 */
public class PyramidProgram {

	public static void main(String[] args) {
		
		int Row = 6;	
		int temp=6;
		for(int i=0;i<Row;i++)
		{
			for(int j=Row-i-1;j>0;j--)
			{
				System.out.print(" ");				
			}	
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");		
			}
			System.out.println("");
		}
	}

}
