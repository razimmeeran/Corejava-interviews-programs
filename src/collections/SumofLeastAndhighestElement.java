/**
 * 
 */
package collections;

import java.util.*;

/**
 * sum of second least and second highest element
 *
 */
public class SumofLeastAndhighestElement {

	public static void main(String[] args) {
		int [] number = {5,3,6,1,0,3,2,7,8};
		Arrays.sort(number);
		
		System.out.println("second least number= "+number[1]+" 2nd Highest number= "+number[number.length-1]);
		System.out.println("Sum: "+number[1]+number[number.length-1]);	
	}

}
