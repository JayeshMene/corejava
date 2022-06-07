package multithreading;

public class SetThreadPriority1 extends Thread {
	public void run() 
		{
			System.out.println("Thread " + Thread.currentThread().getName() +" started");

			System.out.println("Thread with priority " +Thread.currentThread().getPriority() + " is running");

		}
	public static void main(String[] args) {
		
		SetThreadPriority1 t1 = new SetThreadPriority1();
		SetThreadPriority1 t2 = new SetThreadPriority1();
		SetThreadPriority1 t3 = new SetThreadPriority1();
		
		t1.setPriority(3);
		t2.setPriority(9);
		t3.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
	}
}