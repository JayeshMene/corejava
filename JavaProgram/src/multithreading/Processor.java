package multithreading;

import java.util.Scanner;

public class Processor {
	public void produce () throws InterruptedException
	{
		synchronized (this)
		{
			System.out.println("Producer Thread running.... ");
			wait();
			System.out.println("Resumed.");
		}
	}

	public void main() throws InterruptedException {
		
		Scanner sc = new Scanner (System.in);
		Thread.sleep(0);
		synchronized (this)
		{
		System.out.println("Waiting for return key.");	
		sc.nextLine();
		System.out.println("Return key pressed...");
		notify();
		sc.close();
		}
		
	}
	public static void main (String [] args) throws Exception {
		Processor p =  new Processor();
		p.produce();
		p.main();
	}

}
