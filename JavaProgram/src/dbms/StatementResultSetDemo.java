package dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
public class StatementResultSetDemo {
public static void main(String[] args) {

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jayesh", "root", "Jayesh@123");

		Statement st = con.createStatement();
		String query = "select employeeId ,employeeName from employee";
		ResultSet rs = st.executeQuery(query);
		ResultSetMetaData rsmt = rs.getMetaData();
		System.out.println(rsmt);
		int cols = rsmt.getColumnCount();
		while(rs.next()) {
			for(int i= 1; i<=cols;i++) {
				System.out.println(rs.getString(i)+ "\t");
			}
			System.out.println("");
		}
		st.close();
		con.close();
	}
	catch(Exception e){
		System.out.println(e);
	}
	}
}