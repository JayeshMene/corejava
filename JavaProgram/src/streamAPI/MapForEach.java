package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapForEach {

	public static void main(String[] args) {
		
		ArrayList<Integer> ji = new ArrayList<Integer>();
		ji.add(0);
		ji.add(72);
		ji.add(42);
		ji.add(27);
		ji.add(10);
		ji.add(20);
		ji.add(70/2);
		ji.add(-45);
		
		System.out.println(ji);
		
		List<Integer> j1 = ji.stream().map(i -> i+10).collect(Collectors.toList());
		j1.stream().forEach(i -> System.out.println(i + " "));
		
		System.out.println(" ");
		j1.stream().forEach(System.out::println);

	}

}
