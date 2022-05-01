package javapg;

public class Code18 { 		//FOR LOOP

	public static void main(String[] args) {
		
		int number = 5;
		boolean isPrime = true;
		for (int i=2; i< number/2; i++)
		{
			if (number % i == 0)
			{
				isPrime = false;
			}
		}
		if (isPrime == true)
		{
			System.out.println("The number is Prime Number");
		}
		else
		{
			System.out.println("The number is not a prime number");
		}

	}

}
