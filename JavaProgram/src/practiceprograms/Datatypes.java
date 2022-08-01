package practiceprograms;
class Primitive
{
	public void Numeric ()
	{
		System.out.println
		(		"byte 1"
				+"\n"+ "short 2"
				+"\n" +"int 4"
				+ "\n"+"long 8"
				+ "\n"+"double 8"
				+ "\n"+"float 4");
	}
	public void Non_numeric()
	{
		System.out.println("char 2"+"\n"+"boolean 1");
	}
}
class NonPrimitive
{
	public void disp()
	{
		System.out.println("class"+"\n"+"Array"+"\n"+"String");
	}
}
public class Datatypes {

	public static void main(String[] args)
	{
	Primitive dt = new Primitive ();
	NonPrimitive nt = new NonPrimitive();
	dt.Numeric(); dt.Non_numeric();
	nt.disp();

	}

}
