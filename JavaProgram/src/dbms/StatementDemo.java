package dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class StatementDemo
{
	public static void main(String[] args) throws Exception
	{
	
		Class.forName("com.mysql.cj.jdbc.Driver");

		DriverManager.getConnection("jdbc:mysql://localhost:3306/jayesh","root","Jayesh@123");
		String url = "jdbc:mysql://localhost:3306/jayesh";
		Properties p= new Properties();
		p.put("user", "root");
		p.put("password", "Jayesh@123");
		Connection con = DriverManager.getConnection(url, p);
		Statement st = con.createStatement();
		String query1 = "create table studentC(id int primary key, name varchar(20), age int)";

		int i = st.executeUpdate(query1);
		int j = st.executeUpdate("create table student1(id int primary key, name varchar(20), age int)");

		System.out.println("No of rows affected: " +i);
		System.out.println("No of rows affected: " +j);
		System.out.println("Table created Sucessfully");
		st.close();
		con.close();
	}
}
