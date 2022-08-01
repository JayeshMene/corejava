package practiceprograms;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		int a;
		System.out.println("enter your age :");
		
		Scanner sc = new Scanner (System.in);
		a= sc.nextInt();
		if (18>=a)
		{
			System.out.println("You are eligible bro");
		}
		else if (a>=50)
		{
			System.out.println("You congratulate yourself for your 50");
		}
		else
		{
			System.out.println("you are not eligible baby");
		}
		sc.close();
	}

}
