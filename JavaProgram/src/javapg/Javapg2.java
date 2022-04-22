package javapg;

public class Javapg2 {

	 int yearofpurchase;
	 String model;
	 double cost;
	 public void disp1()
	 {
		 System.out.println("year of purchase=" + 2001);
	 }
	  public void disp2()
	  {
		  System.out.println("model=" + 1999);
		  System.out.println("cost="+ 200000);
	  }
	  
		public static void main(String[] args)
		{
			Javapg2 hai =new Javapg2();
			Javapg2 bye =new Javapg2();
			hai.disp1();
			bye.disp2();
		}
	}

