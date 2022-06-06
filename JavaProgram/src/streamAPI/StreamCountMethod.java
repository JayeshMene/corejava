package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class StreamCountMethod {

	public static void main(String[] args) {
		
		List<String> namelist = new ArrayList<>();
		namelist.add("INDIA");
		namelist.add("RUSSIA");
		namelist.add("AMERICA");
		namelist.add("ENGLAND");
		namelist.add("AUSTRALIA");
		namelist.add("ZIMBABWE");
		
		Long count = namelist.stream().filter(s -> s.length() > 5).count();
		System.out.println("Total name with more than 5 lenth is : "+count);  // The output is 5.
	}

}
