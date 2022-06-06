package dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class StudentStatementInsert {
		public static void main(String[] args) throws Exception{

			Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jayesh","root","Jayesh@123");
			String url = "jdbc:mysql://localhost:3306/jayesh";
			Properties p = new Properties();
			p.put("user", "root");
			p.put("password","Jayesh@123");
			Connection con = DriverManager.getConnection(url, p);
			
			Statement st = con.createStatement();
			
			String query = "insert into students values(4,'Aniket',20)";
			int i = st.executeUpdate(query);//
			boolean t = st.execute("insert into students values(5,'Jyoti',40)");
			System.out.println("No of rows affected:" + i);//1
			System.out.println("Query executed" + t);//
			System.out.println("Row inserted successfully");
			st.close();
			con.close();
		}
}
