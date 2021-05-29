package coreJavaPackage;

public class PalindromInteger {

	public static void main(String[] args) {
		
		int Actual =  12321;
		int input = Actual;
		int Reverse = 0;
		
		int length = String.valueOf(Actual).toString().length();
		
		for (int i = 1; i<=length;i++)
		{
			int reminder = Actual%10;
			int quotient = Actual/10;
			
			Reverse = Reverse*10+reminder;
			Actual = quotient;
			
		}
		if(input==Reverse)
		{
			System.out.println("The Given Number "+ input+" is Palindrom");
		}
		else
		{
			System.out.println("The Given Number "+ input+" is Not a Palindrom");
		}
	}

}
