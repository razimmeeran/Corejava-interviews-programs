package coreJavaPackage;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num=153;
		int actualNumber= num;
		int reminder, quotient;
		int temp =0;
		
		int length = String.valueOf(num).length();
		
		for(int i =1 ; i<=length; i++)
		{
			reminder= num % 10;
			quotient= num / 10;
			
			temp= temp*10+reminder;
			num=quotient;
					
		}
		
		System.out.println("Reverse Number of "+ actualNumber + " is "+temp);

	}

}
