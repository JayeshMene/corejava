package javapg;

class eclipse1 extends Thread 		//Thread program by extends keyword
{	
	public void run ()	//for running the thread program we need void run method
	{
		System.out.print("Hello");
	}
}

class notebook1 extends Thread
{
	public void run ()
	{
		System.out.println(" " +"Jayesh");
	}
}

class chrome1 extends Thread 
{
	public void run()
	{
		System.out.println("Whats up??");
	}
}
public class Threadpro {

	public static void main(String[] args) {
		eclipse1 ob = new eclipse1();
		ob.start();
		
		notebook1 ob1 = new notebook1 ();
		ob1.start();
		
		chrome1 ob2 =new chrome1();
		ob2.start();
		

	}

}