package practiceprograms;

class jayesh
{
	int a =1234567890;
	double d = 8.7;					//these all are instance variable. 
	float f = 8.7f;
	long l = 748436438;
	static byte b = 22;
	char c = 'j'; 					//character always in single coat 
	boolean k = true;
	static int s = 27;				//these is a static variable.
}
public class Variables {

	public static void main(String[] args) {
		boolean z = false;			//local variable.
		 
		jayesh p = new jayesh ();
		System.out.println(p.l);
		System.out.println(jayesh.s);
		System.out.println(jayesh.b);
		System.out.println(z);
				
	}

}
