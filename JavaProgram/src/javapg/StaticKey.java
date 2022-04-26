package javapg;

 public class  StaticKey {
	 static String sum = "Sum";
	 static String diff = "Difference";

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c= a+b;
		int d = a-b;
		
		System.out.println(sum +" " +c);
		System.out.println(diff+ " " + d);
		
	}
}
