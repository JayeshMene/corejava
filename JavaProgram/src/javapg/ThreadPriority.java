package javapg;
								// Thread Priority get priority.
public class ThreadPriority extends Thread{
	
	public void run()
	{
		System.out.println("Thread"+ Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		ThreadPriority t1 = new ThreadPriority ();
		ThreadPriority t2 = new ThreadPriority ();
		ThreadPriority t3 = new ThreadPriority ();
		t1.start ();
		t2.start();
		t3.start();
		System.out.println("priority of " +" " +t1.getName()+" "+ t1.getPriority());
		System.out.println("priority of " + " "+t2.getName()+" "+ t2.getPriority());
		System.out.println("priority of " + " "+t3.getName()+ " "+ t3.getPriority());

	}

}
