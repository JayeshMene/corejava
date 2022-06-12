package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Jayesh ");
		ts.add("is ");
		ts.add("My ");
		ts.add("name ");
		
		
		
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}

	}

}
