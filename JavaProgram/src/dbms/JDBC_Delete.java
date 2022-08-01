package dbms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Delete {

public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jayesh","root","Jayesh@123");
			
			Statement smt= con.createStatement();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
				System.out.println("Enter Deletion Emp Id :");
				int eno = Integer.parseInt(br.readLine());
				
				int count = smt.executeUpdate("DELETE From emp where eno ="+eno);
				if (count==1)
					System.out.println("Rows Deleted" + count);
				else
					System.out.println("No Rows Deleted");
				
				System.out.println("Do you want to Continue[Yes/No]");
				String ch= br.readLine();
				if (ch.equalsIgnoreCase("No"))
				break;
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}