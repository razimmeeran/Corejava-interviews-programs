package collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * If user want to to add Mohamed in 2 place and copy all to list 2
 * if user wants to copy one list to another
 *
 */
public class ArrayListStringCopy {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Razim");
		list1.add("Esha");
		list1.add("Meeran");
		
		list1.add(1, "Mohamed");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.addAll(list1);
		
		
		Iterator<String> ir = list2.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
	}

}
