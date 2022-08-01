package inheritance;
class One1
{
void disp1()
{
System.out.println("One");
}
}
class Two1 extends One1
{
void disp2()
{
System.out.println("Two");
}
}
class Three1 extends One1
{
void disp3()
{
System.out.println("Three");
}
}
class Four1 extends One1
{
void disp4()
{
System.out.println("Four");
}
}
public class Hierachical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Four1 r1 = new Four1();
		r1.disp1(); r1.disp4();
		
		Three1 r2 = new Three1();
		r2.disp1(); r2.disp3();
		
		Two1 r3 = new Two1();
		r3.disp1(); r3.disp2();
		
		One1 r4 = new One1();
		r4.disp1();
	}

}
