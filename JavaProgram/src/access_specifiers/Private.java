package access_specifiers;

public class Private {		//It Can be access within class only
	private double num=100;
	private int square(int a)
	{
		return a*a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Private obj =new Private();
 System.out.println(obj.num);
 System.out.println(obj.square(10));
	}

}