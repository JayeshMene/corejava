package javapg;

class eclipse extends Thread 		//Thread program by extends keyword
{	
	public void run ()	//for running the thread program we need void run method
	{
		System.out.print("Hello");
	}
}

class notebook extends Thread
{
	public void run ()
	{
		System.out.println(" " +"Jayesh");
	}
}

class chrome extends Thread 
{
	public void run()
	{
		System.out.println("Whats up??");
	}
}
public class Threadpg {

	public static void main(String[] args) {
		eclipse ob = new eclipse();
		ob.start();
		
		notebook ob1 = new notebook ();
		ob1.start();
		
		chrome ob2 =new chrome();
		ob2.start();
		

	}

}
