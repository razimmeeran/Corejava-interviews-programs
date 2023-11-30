package coreJavaPackage;

public class GitPractice {

	/*Armstrong Number
	 * 
	 * 153= 1^3 + 5^3 + 3^3 = 153
	 * 
	 */
	
	
	public static void main(String[] args) 
	{
		int num = 153;
		int ActualNumber = num;
		int reminder, quotint;
		int temp = 0;
		int length = String.valueOf(num).length();
		
		for (int i=0; i<length; i++)
		{
			reminder = num%10;
			quotint = num/10;
			
			temp=temp+(reminder*reminder*reminder);
			
			num=quotint;
						
		}
		
		if (ActualNumber== temp)
		{
			System.out.println(ActualNumber + " is a Amstrong Number");
			
		}
		else
		{
			System.out.println(ActualNumber + " is not a Amstrong Number");
		}

	}

}
