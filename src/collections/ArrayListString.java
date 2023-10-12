package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListString {

	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<String>();
		list.add("My Family:");
		list.add("----------");
		list.add("Razim");
		list.add("Meeran");
		list.add("Esha");
		list.add("Shami");
		
		Iterator Ir = list.iterator();
		while(Ir.hasNext())
		{
			System.out.println(Ir.next());
		}
	}
}
