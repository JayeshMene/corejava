package project1;

class withdraw
{
	int amt_withdraw= 2000;
}

public class atm extends withdraw
{
	int amt_left= 5000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		atm obl= new atm();
		System.out.println("amt withdraw =" + obl.amt_withdraw);
		System.out.println("amt_left =" + obl.amt_left);
		
	}

}
