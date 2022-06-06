package dbms;

import java.sql.*;
	public class StudentPreparedStatementInsert {
		public static void main(String[] args) {

			Connection con = null;
			PreparedStatement pt = null;
			try {
				//Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jayesh","root","Jayesh@123" );

				pt = con.prepareStatement("insert into student1 values(?,?,?)");
				pt.setInt(1,2);
				pt.setString(2,"Priti");
				pt.setInt(3, 30);
				boolean i = pt.execute();
				System.out.println("No of rows affectred:" + i);
				System.out.println("Rows inserted successfully");
			}
			catch(Exception e) {
				System.out.println(e);
			}
			finally {
				try {
					if(pt!=null) {
						pt.close();
						pt =null;
					}
				}
				catch(Exception e) {
					System.out.println(e);
				}
				try {
					if(con!=null) {
						con.close();
						con =null;
					}
				}
				catch(Exception e) {
					System.out.println(e);
				}

			}
	}
}
