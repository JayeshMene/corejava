
public class abc {
	abc()
	{
		
	}
	abc(abc m)
	{
		m1= m;
	}
	abc m1;

	public static void main(String[] args) {
		abc m2 = new abc ();
		abc m3 = new abc (m2); m3.go();
		abc m4 = m3.m1; m4.go();
		abc m5 = m2.m1; m3.go();
	}
	void go()
	{
		System.out.println("hiii");
	}

}
