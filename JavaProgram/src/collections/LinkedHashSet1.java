package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Hello ");
		lhs.add("there");
		lhs.add("??");
		
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}

	}

}
