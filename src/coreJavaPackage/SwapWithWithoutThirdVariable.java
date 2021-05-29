package coreJavaPackage;

public class SwapWithWithoutThirdVariable {

	public static void main(String[] args) {

		int a = 3;
		int b = 2;
		
		System.out.println("Befre Swap = "+a+" , " +b);
		
		a= a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swap = "+a+" , " +b);

	}

}
