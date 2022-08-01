package arrays;

public class Array {

	public static void main(String[] args) {
	
			int array[] = {10,20,25,43,33};	//declaring array with initialize value
			
			int sum = 0; 		//initialize sum variable with 0
			
			for (int i=0; i<array.length; i++)
			{
				sum += array[i];
			}
			System.out.println("Sum of Array Elements =" +sum);

	}

}

