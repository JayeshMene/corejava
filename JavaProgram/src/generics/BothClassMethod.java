package generics;

class Gen <T>
{
	T ob ;
	Gen (T o)
	{
		ob = o;
	}
	public T getob()
	{
		return ob ;
	}
}
public class BothClassMethod {

	public static void main(String[] args) {
		Gen <Integer> iob = new Gen<>(100);
		int x= iob .getob();
		System.out.println(x);
		
		Gen <String > sob = new Gen <>("Hello Buddy");
		String str = sob.getob();
		System.out.println(str);

	}

}
