package javapg;

public class Overloading {
	int volume (int s)
	{
		int vol = s*s*s;
		return vol;
	}
	
	int volume (int l, int m, int n)
	{
		int vol = l*m*n;
		return vol;
	}
	
	 double  vol (int r)
	{
		double vol = 4/3*3.14*r*r*r;
		return  vol;
	} 

	public static void main(String[] args) {
		Overloading o = new Overloading();
		System.out.println("Volume of cube ="+ o.volume(2));
		System.out.println("Volume of cuboid ="+ o.volume(2, 2, 2));
		System.out.println("Volume of Sphere =" + o.vol(2));
	}

}
