package coreJavaPackage;

public class ReverseStringUsingStringBuffer {

	public static void main(String[] args) 
	{
		String Name="RAZIM";
		
		StringBuffer buffer = new StringBuffer(Name);
		
		System.out.println(buffer.reverse());

	}

}
