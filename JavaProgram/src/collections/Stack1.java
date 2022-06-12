package collections;

import java.util.Iterator;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		stack.push("hii");
		stack.push("Hello");
		
		Iterator<String> itr = stack.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next() + " ");
		}
		System.out.println();
		
		stack.pop();
		itr = stack.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+ " ");
		}
	}
}
