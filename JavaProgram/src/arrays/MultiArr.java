package arrays;

public class MultiArr {
	public static void main(String args[])
	 {
	 
	 int arr[][] = { {2,7,9},{3,6,1},{7,4,2} };		//Declare and Initialize
	 
	 for (int i=0; i< 3 ; i++)						//for loop FOR Rows
	 {
	 for (int j=0; j < 3 ; j++)						//for loop FOR Columns
		 
	 System.out.print(arr[i][j] + " ");
	 System.out.println("\n");						// \n is for spacing betn rows
	 }
	 }

}
