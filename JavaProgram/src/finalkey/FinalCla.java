package finalkey;
 final class Test1
{
	void Number()
	{
		System.out.println("9503556360");
	}
	void Atmpin()
	{
		System.out.println("9878");
	}
}
  /*	 class Thief1 extends Test1
{
	void Number()
	{
		System.out.println("9503556361");
	}
 	void Atmpin()
	{
		System.out.println("6373");
	} 
	
}  when we declare a class as a final it can't be extended or inherited to sub class.
*/ 
public class FinalCla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Thief1 r = new Thief1(); We can't use Thief method to call.
		Test1 r = new Test1();
		r.Number();
		r.Atmpin();
	}

}
