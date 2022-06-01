package generics;

public class GenericMethod {
	public <T>void methodgen(T var1 )
	{
		System.out.println("The value passed is of type  " +var1.getClass().getSimpleName());
	}
	public static void main(String[] args) {
		
		GenericMethod ob = new GenericMethod();
		ob.<String>methodgen("I m the Best");
		
		ob.methodgen("Learning java at");
		ob.methodgen(652);
	}

}
