package practiceprograms;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) throws Exception {
		int a; double sum;
		double b;
		System.out.println("Enter two No.");
		Scanner sc = new Scanner (System.in);
		a = sc.nextInt();
		b = sc.nextDouble();
		sum = a + b ;
		System.out.println("the Add of two no.s : "+sum);
		sc.close();
	}

}
