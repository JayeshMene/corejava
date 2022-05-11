package javapg;

public class Throws {		//Exception in thread by throws keyword
	
		static void checkAge(int age) throws ArithmeticException {
		if (age < 18) {
		throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		} else {
		System.out.println("Access granted - You are old enough!");
		}
		}
		public static void main(String[] args) {
		checkAge(15);
		}
}
