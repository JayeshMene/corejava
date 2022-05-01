package javapg;

public class Code21 {

	public static void main(String[] args) {
		 
		// FOR LOOP
		
		for( int p=1,q=1; p<10||q<10; p++,q++)
		{
			q++;
			System.out.println("p=" +p+"and q="+q);
		}
		
		// WHILE LOOP
		
		int i=1, j=1;
		while (i<=10||j<=10)
		{
			i++; j++;
			System.out.println("i="+i +"and j="+j);
		}
		
		// DO WHILE LOOP
		
		int x=1, y=1;
		do 
		{
			x++;
			y++;
			System.out.println("x="+x + "and y="+y);
		}while (x<10||y<10);
		

	}

}
