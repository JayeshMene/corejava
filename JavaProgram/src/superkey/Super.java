package superkey;
 
class Abc
{
	int i=20;
}
class Xyz extends Abc
{
	 int i=50;
	 void show(int i)
	 {
		 System.out.println(super.i);
		 System.out.println(this.i);
		 System.out.println(i);
	 }
}
public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xyz r = new Xyz();
		r.show(30);
	}

}
