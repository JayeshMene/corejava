package javapg;

public class JaggedA {

	public static void main(String[] args)
	 {
	 
	 int arr[][] = new int[2][0];				//Declaring
	
	
	 arr[0] = new int[4];				
	
	 arr[1] = new int[3];
	 
	 int count = 0;								// Initializing 
	 for (int i=0; i<arr.length; i++)
	 for(int j=0; j<arr[i].length; j++)
	 arr[i][j] = count++; 
	 
	 System.out.println("Contents of 2D Jagged Array");
	 for (int i=0; i<arr.length; i++)
	 {
	 for (int j=0; j<arr[i].length; j++)
	 System.out.print(arr[i][j] + " ");
	 System.out.println();
	 }
	 }
}
