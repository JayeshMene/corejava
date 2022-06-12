package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet<String> hs= new HashSet<String>();
		hs.add("this is ");
		hs.add("for me. ");
		
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext())
		{
			System.out.print(itr.next());
		}

	}

}
