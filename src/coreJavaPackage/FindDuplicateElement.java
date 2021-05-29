package coreJavaPackage;

public class FindDuplicateElement {

	public static void main(String[] args) {

		String name[] = {"Java", "Python", "Ruby", "Java","Ruby"};
		
		for (int i = 0; i<name.length; i++)
		{
			for (int j=i+1; j<name.length; j++ )
			{
				if (name[i].equals(name[j]))
				{
					System.out.println(name[i]+" is duplicate");
				}
			}
		}
		

	}

}
