
/* Factorial of 6
 * 1+2+
 * 
 * */



package coreJavaPackage;

public class Factorial {

	public static void main(String[] args) {
		
		int num = 6;
		int fact = 1;
		
		for(int i=1;i<=num;i++)
		{
			
			fact=fact*i;
			
		}
		
		System.out.println("Factorial of the number "+ num +" is "+ fact );
		
	}

}
