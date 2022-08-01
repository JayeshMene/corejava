package overriding;

class chrome
{
  void view()
  {
	  System.out.println("parent class");
  }
}
class desktop extends chrome
{
	void view()
	{
		System.out.println("child class");
		super.view();
	}
}
public class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chrome ob =new chrome();
		//ob.view();
		
		desktop ob1 =new desktop();
		ob1.view();
		

	}

}