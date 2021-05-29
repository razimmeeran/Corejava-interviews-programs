package coreJavaPackage;

public class PalindromStringTest {

	public static void main(String[] args) {
		
		String Name="MALAYALAM";
		String Reverse = "";
		int length=Name.length();
		
		for (int i =length-1; i>=0; i--)
		{
			Reverse = Reverse+ Name.charAt(i);
			
		}
		
		if(Name.equalsIgnoreCase(Reverse))
		{
			System.out.println("The Given Text "+ Name+" is Palindrom");
		}
		else
		{
			System.out.println("The Given Text "+ Name+" is Not a Palindrom");
		}
	}

}
