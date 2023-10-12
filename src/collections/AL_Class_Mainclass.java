package collections;

import java.util.ArrayList;

public class AL_Class_Mainclass {

	public static void main(String[] args) {
		
		AL_Class_Subclass name1 = new AL_Class_Subclass("Razim", "Meeran");
		AL_Class_Subclass name2 = new AL_Class_Subclass("Esha", "Razim");
		
		ArrayList<AL_Class_Subclass> list = new ArrayList<AL_Class_Subclass>();
		list.add(name1);
		list.add(name2);		
	}

}
