package javapg;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		int num;
		System.out.println("please enter your age");
		Scanner s = new Scanner (System.in);
		num = s.nextInt();
		
	
		if (num<18)
		{
			System.out.println("You are not eligible for voting");
		}
		else
		{
			System.out.println("you are eligible kindly vote");
		}
	}

}
