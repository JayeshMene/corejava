package constructor;

public class Parameterized
{
	Parameterized()
{
	System.out.println("this is a default constructor");
}
	Parameterized(int a,int b)
{
	System.out.println("constructor with two parameterised");
}
	Parameterized(int c,int d,int e)
{
	System.out.println("constructor with three parameters");
}
	Parameterized(int i,String name)
{
	System.out.println("constructor with int and string parameter");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterized ob1=new Parameterized();
		Parameterized ob2=new Parameterized(1,2);
		Parameterized ob3=new Parameterized(1,2,3);
		Parameterized ob4=new Parameterized(5,"Jayesh");
		

	}

}