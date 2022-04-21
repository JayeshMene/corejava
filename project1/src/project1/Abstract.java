package project1;

abstract class atm1
{
	abstract void withdraw();
}
	
public class Abstract extends atm1
{
	 void withdraw()
	 {
		 System.out.println("withdraw successfull");
	 }

	public static void main(String[] args) 
	{
		Abstract a = new Abstract();
		a.withdraw();

	}

}
