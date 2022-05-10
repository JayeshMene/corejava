package javapg;

public class TryCatchDemo { 		//Try Catch Blocks Exception

	public static void main(String[] args) {
		
		String str = null;
		try {
			str.equals("Hello");
		} catch (NullPointerException ne) {
			str = new String ("Hello");
			System.out.println(str.equals("Hello"));
		}
		System.out.println("Continuing the program");

	}

}
