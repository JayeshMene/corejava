package project1;

public class Poly 
{
	void add(int x, int y)
	{
		System.out.println("add 2 nos " + (x+y));
	}
	void add(int x, int y, int z)
	{
		System.out.println("add 3 nos "+(x+y+z));
	}

	public static void main(String[] args)
	{
		Poly a = new Poly();
		a.add (5,6);
		a.add (3, 3, 7);

	}

}
