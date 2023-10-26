package coreJavaPackage;

public class BasicStarProgram {

	public static void main(String[] args) {
		int i, j, Row=7;		
		for(i=0;i<Row;i++)
		{		
			for(j=Row-i; j>1; j--)
			{
				System.out.print(" ");	
				//System.out.print("J = "+j);
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");	
			}
			System.out.println();   
		}
	}
}
