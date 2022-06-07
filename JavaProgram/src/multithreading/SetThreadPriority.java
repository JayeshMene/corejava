package multithreading;

public class SetThreadPriority extends Thread {
	public void run() 
	{
		System.out.println("Thread " + Thread.currentThread().getName() +" started");

		System.out.println("Thread with priority " +Thread.currentThread().getPriority() + " is running");

	}
	
public static void main(String[] args) {
	
	SetThreadPriority t1 = new SetThreadPriority();
	SetThreadPriority t2 = new SetThreadPriority();
	SetThreadPriority t3 = new SetThreadPriority();
	
	t1.setPriority(MIN_PRIORITY);
	t2.setPriority(NORM_PRIORITY);
	t3.setPriority(MAX_PRIORITY);
	
	t1.start();
	t2.start();
	t3.start();
}
}