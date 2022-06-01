package generics;

class GenericClass1<T>
{
	GenericClass1()
	{
		System.out.println("The Generic Class is Declared Now. You can use it well");
	}


public void methodgeneric (T obj)
	{
		System.out.println("The type of object of these class now contains is "+obj.getClass().getSimpleName() );
	}
}
public class GenericClass {
	 
	public static void main(String[] args) {
	
		GenericClass1<Integer> tests = new GenericClass1<>();
		Integer a=9;
		tests.methodgeneric(a);
		
		GenericClass1<String> testsstring = new GenericClass1<>();
		String s = " Hello Buddy";
		testsstring.methodgeneric(s);
	}

}
