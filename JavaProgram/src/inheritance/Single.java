package inheritance;

class A
{
	void disp()
	{
		System.out.println("Display Call");
	}
}
class B extends A
{
	void Disp()
	{
		System.out.println("display Method call");
	}
}
public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 B call = new B();
 call.disp();
 call.Disp();
	}

}
