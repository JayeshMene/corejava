package lambda;

interface statement
{
	public String greet();
}
public class LambdaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		statement s=()->
		{
			return "hello";
		};
		System.out.println(s.greet());
		

	}

}
