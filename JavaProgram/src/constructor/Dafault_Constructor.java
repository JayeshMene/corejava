package constructor;

class student
{
 String name;
 String adress;
 int sales_amount;
 int phone;	

student()
   {
	name="Jayesh";
	adress="Mene";
	sales_amount=1000;
	phone=837828282;
	System.out.println("student object is created");
   }
}

public class Dafault_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student obj=new student();

	}

}