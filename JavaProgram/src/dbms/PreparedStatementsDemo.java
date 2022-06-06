package dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
	public class PreparedStatementsDemo {
		public static void main(String[] args) {

			Connection con = null;
			PreparedStatement pt = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jayesh","root", "Jayesh@123");

				pt = con.prepareStatement("insert into employee values(?,?,?)");
				pt.setInt(1, 1);
				pt.setString(2,"Mayuri");
				pt.setDouble(3, 30000);
				int i = pt.executeUpdate();
				System.out.println("No. of rows affected -" +i);
			}
			catch(Exception e) {
			}
			finally {
				try {
					if(pt!= null) {
						pt.close();
						pt =null;
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				try {
					if(con!= null) {
						con.close();
						con = null;
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}

}
