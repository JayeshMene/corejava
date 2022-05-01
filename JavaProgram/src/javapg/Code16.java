package javapg;

public class Code16 {		//SWITCH CASE IN JAVA (STRING)

	public static void main(String[] args) {
		
		String name = "editor";
		switch (name.toLowerCase())
		{
		case "author" :
			System.out.println("Jayesh");
			break;
			
		case "team" :
			System.out.println("Java Full Stack Developer");
			break;
			
		case "editor" :
			System.out.println("My life");
			break;
			
		default :
			System.out.println("invalid entry");
			break;
		}
	}

}
