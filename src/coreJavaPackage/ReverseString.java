package coreJavaPackage;

public class ReverseString {

	public static void main(String[] args) {
		
		String name = "RAZIM";
		
		int length=name.length();
		
		String temp="";
		
		for (int i =length-1; i>=0; i--)
		{
			temp=temp + name.charAt(i);
			
		}
		System.out.print(temp);
	
	}

}
