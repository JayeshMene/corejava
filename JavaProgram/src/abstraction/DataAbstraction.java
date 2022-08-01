package abstraction;

abstract class atm
{
	abstract void withdraw();
}

public class DataAbstraction extends atm
{
	void withdraw()
	{
		System.out.println("withdraw successfully");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataAbstraction obj=new DataAbstraction();
		obj.withdraw();
		

	}

}
