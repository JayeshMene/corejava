package finalkey;
class Test
{
	void Number()
	{
		System.out.println("9503556361");
	}
	final void Atmpin()
	{
		System.out.println("6373");
	}
}
class Thief extends Test
{
	void Number()
	{
		System.out.println("9503556361");
	}
 /*	void Atmpin()
	{
		System.out.println("6373");
	} 
	we cant use Atmpin method in sub class as we made it final class
	it shows an error of overrides*/
}
public class FinalMet
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thief r =new Thief();
		r.Number();
		r.Atmpin();
	}

}
