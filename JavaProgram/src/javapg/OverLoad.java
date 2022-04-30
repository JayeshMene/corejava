package javapg;

public class OverLoad {
	void volume(int s )
{
	int vol = s*s*s;
	System.out.println("volume of cube =" +vol);
}
	void volume (int l, int m, int n)
	{
		int vol =l*m*n;
		System.out.println("volume of cuboid ="+ vol);
	}
	void  volume (double r)
	{
		double vol = 4/3*3.14*r*r*r;
		System.out.println("volume of sphere ="+ vol);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoad r = new OverLoad();
		r.volume(2);
		r.volume(2, 5, 6);
		r.volume(2.4);
	}

}
