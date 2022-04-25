package javapg;
class One
{
void disp1()
{
System.out.println("One");
}
}
class Two extends One
{
void disp2()
{
System.out.println("Two");
}
}
class Three extends Two
{
void disp3()
{
System.out.println("Three");
}
}
class Four extends Three
{
void disp4()
{
System.out.println("Four");
}
}
public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Four r = new Four();
		r.disp1();
		r.disp2();
		r.disp3();
		r.disp4();
		
	}

}
