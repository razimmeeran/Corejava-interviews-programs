/**
 * 
 */
package collections;

import java.util.ArrayList;
import java.util.Collections;

public class List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0, 4);
		list.add(1, 3);
		list.add(2, 6);
		list.add(3, 9);
		
		Collections.sort(list);
		
		list.remove(2);
		
		System.out.println(list);
		list.add(2, 7);
		System.out.println(list);
		list.add(2,8);
		System.out.println(list);
	}
}
