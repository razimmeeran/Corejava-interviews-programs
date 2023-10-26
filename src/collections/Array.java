/**
 * 
 */
package collections;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author RAZIM MEERAN
 *
 */
public class Array {

	public static void fixedSize()
	{
		int[] myArray = new int[5];
		
		myArray[0]=4;
		myArray[1]=3;
		myArray[2]=6;
		myArray[3]=9;
		myArray[4]=5;
		
		Arrays.sort(myArray);
		
		for (int i = 0; i < myArray.length; i++) {
		    System.out.println(myArray[i]);
		}
	}	
	
	public static void array()
	{
		int[] myArray = {4,3,6,9,5};
		
		//Arrays.sort(myArray);
		
		for (int i = 0; i < myArray.length; i++) {
		    System.out.print(myArray[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Array.fixedSize();
		Array.array();
	}
		

}
