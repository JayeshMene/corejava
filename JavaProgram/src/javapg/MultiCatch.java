package javapg;

public class MultiCatch { 		//Multiple Try Catch blocks

	public static void main(String[] args) {
		
		try {
			int a = args.length;
			System.out.println("a=" +a);
			int b=42/a;
			int c[] = {1};
			c[42] = 99;
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero :" +e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index OOB :" +e);
		}
		catch (Exception e) {
			System.out.println("Generic Excepyion :" +e);
		}
		System.out.println("After Try/catch blocks");
	}

}
