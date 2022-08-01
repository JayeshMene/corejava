package javapg;

import java.util.Scanner;			// nested if else 

public class Practice2 {

	public static void main(String[] args) {
	int a, b, c;
	System.out.println("Enter the value of a b c");
	Scanner s = new Scanner (System.in);
	a=s.nextInt(); b=s.nextInt(); c=s.nextInt();
	
	
	if (a>b)
	{
		if (a>c)
		{
			System.out.println("Maximum Number" +a);
		}
		else {
			System.out.println("Minimum number"+c);
		}
	}
	else
	{
		if (b>c)
		{
			System.out.println("Maximum Number "+b);
		}
		else
		{
			System.out.println("Minimum Number"+c);
		}
	}
	}

}
