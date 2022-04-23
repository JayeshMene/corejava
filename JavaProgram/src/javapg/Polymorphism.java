package javapg;

public class Polymorphism 
{
	void add(int x,int y)
	{
		System.err.println("add 2 nos " + (x+y));
	}
	void add(int x,int y,int z)
	{
		System.out.println("add 3 nos " + (x+y+z));
	}
	
	public static void main(String[] args)
	{
	 Polymorphism a = new Polymorphism();
	 a.add(5, 3);
	 a.add(3, 4, 4);

	}

}
