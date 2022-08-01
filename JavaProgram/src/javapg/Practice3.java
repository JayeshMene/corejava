package javapg;

import java.util.Scanner;

public class Practice3 {		// keep trying with another while conditions 

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter your number");
		Scanner s = new Scanner(System.in);
		num=s.nextInt();
		while (num %2==0)
		{
			for (int j=1;j<=100;j++)
			{
				System.out.println(j);
				
			}break;
		} 

	}

}
