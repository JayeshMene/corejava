package javapg;

public class AtmWithdraw 
	{
		int amt_withdraw= 2000;
	}

		class atm extends AtmWithdraw
	{
		int amt_left= 5000;
		
		public static void main(String[] args)
		{

			atm ob1=  new atm();
			System.out.println("amt withdraw =" + ob1.amt_withdraw);
			System.out.println("amt_left =" + ob1.amt_left);
			
		}

	}
