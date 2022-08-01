package dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Select {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jayesh","root","Jayesh@123");
			
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("SELECT * From emp");
			
			while(rs.next())
			{
				int eid = rs.getInt(1);
				String ename = rs.getString(2);
				double esal = rs.getDouble(3);
				
				System.out.println("Emp Id :"+eid);
				System.out.println("Emp name :"+ename);
				System.out.println("Emp salary :"+esal);
				System.out.println("\n");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
