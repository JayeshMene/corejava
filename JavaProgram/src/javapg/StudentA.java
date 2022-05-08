package javapg;

   class Student
   {
	 public int roll_no;
	 public String name;
	 Student(int roll_no, String name)
	 {
	 this.roll_no = roll_no;
	 this.name = name;
	 }
	}
	public class StudentA
	{
	 public static void main (String[] args)
	 {
	
	 Student[] arr;							// Declaring
	
	 arr = new Student[5];					// Memory Allocation
	 
	 arr[0] = new Student(1,"Aman");		// Initializing
	 
	 arr[1] = new Student(2,"Vaibhav");
	
	 arr[2] = new Student(3,"Shikhar");
	 
	 arr[3] = new Student(4,"Dharmesh");
	 
	 arr[4] = new Student(5,"Mohit");
	 
	 for (int i = 0; i < arr.length; i++)
		 
	 System.out.println("Element at " + i + " : " +
	 arr[i].roll_no +" "+ arr[i].name);
	 }
}
