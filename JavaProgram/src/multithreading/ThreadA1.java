package multithreading;

public class ThreadA1 {
	public static void main(String[] args) throws InterruptedException {
		ThreadB1 b = new ThreadB1();
		b.start();
		synchronized (b)
		{
			System.out.println("main thread calling wait() method");
			b.wait();
			
			System.out.println("main thread got notification call");
			System.out.println("total balance " + b.totalBalance);
		}
	}
}
class ThreadB1 extends Thread {
	int totalBalance = 0;
	public void run() 
	{
		synchronized (this)
		{
			System.out.println("child Thread starts calculation for totalbalance");
 
			for (int i = 0; i <= 5; i++) 
			{
				totalBalance = totalBalance  + i;
			}
			System.out.println("child thread gives notification call"); 

			this.notify();
		}
	}
}