package dbms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Update {

	public static void main(String[] args) {
		
		String value; int eid; double esal;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jayesh","root","Jayesh@123");
			
			Statement smt = con.createStatement();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
				System.out.println("Enter Emp Id :");
				value =br.readLine();
				eid = Integer.parseInt(value);
				
				System.out.println("Enter Emp New Salary :");
				value =br.readLine();
				esal = Double.parseDouble(value);
				
				
				int count = smt.executeUpdate("UPDATE emp set esal ="+esal +"where eno ="+eid);
				if (count>0)
					System.out.println("Rows Updated" + count);
				else
					System.out.println("No Records Found ");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
