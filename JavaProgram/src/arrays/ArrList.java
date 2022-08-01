package arrays;
import java.util.ArrayList;
import java.util.List;
public class ArrList {

	public static void main(String[] args)
	{
	
	List<String> list = new ArrayList<String>();
	
	System.out.println("Adding elements to end of list");
	list.add("A");										 // Adding element at index 0.
	list.add("B");										 // Adding element at index 1.
	list.add("D");										 // Adding element at index 2.
	list.add("E");										 // Adding element at index 3.
	list.add("G");										// Adding element at index 4.
	System.out.println("\n");
	
	System.out.println("ArrayList insertion order: " +list);
	System.out.println("\n");
	
	System.out.println("Adding an element at a specific index after B element.");
	list.add(2, "C");
	System.out.println("\n");
	
	System.out.println("ArrayList insertion order after adding C: " +list );
	System.out.println("\n");
	
	System.out.println("Adding an element at a specific index after E");
	list.add(5, "F");
	System.out.println("\n");
	
	System.out.println("ArrayList insertion order after adding F: " +list);
	}
}
