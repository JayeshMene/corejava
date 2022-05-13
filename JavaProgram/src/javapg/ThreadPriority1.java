package javapg;

public class ThreadPriority1 extends Thread{		//MAX MIN NORM PRIORITY
	
	public void run()
	{
		//System.out.println("Thread"+" "+Thread.currentThread().getName());
		System.out.println("Thread"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		ThreadPriority1 t1 = new ThreadPriority1 ();
		ThreadPriority1 t2 = new ThreadPriority1 ();
		ThreadPriority1 t3 = new ThreadPriority1 ();
		
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("priority of " +" " +t1.getName()+" "+ t1.getPriority());
		System.out.println("priority of " + " "+t2.getName()+" "+ t2.getPriority());
		System.out.println("priority of " + " "+t3.getName()+ " "+ t3.getPriority());
		
	}

}
