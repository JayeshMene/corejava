package dbms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_Insert {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jayesh","root","Jayesh@123");
			
			PreparedStatement psmt= con.prepareStatement("Insert into emp values (?,?,?)");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
				System.out.println("Enter Emp Id :");
				int eno = Integer.parseInt(br.readLine());
				
				System.out.println("Enter Emp Name : ");
				String ename = br.readLine();
				
				System.out.println("Enter Emp Salary :");
				double esal = Double.parseDouble(br.readLine());
				
				psmt.setInt(1, eno);
				psmt.setString(2, ename);
				psmt.setDouble(3, esal);
				
				int count = psmt.executeUpdate();
				if (count>0)
					System.out.println("Records Inserted" + count);
				else
					System.out.println("No Records Inserted");
				
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
