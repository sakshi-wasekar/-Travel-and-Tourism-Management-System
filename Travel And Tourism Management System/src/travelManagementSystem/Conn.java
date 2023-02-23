package travelManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

	Connection connection;
	Statement s;
	public Conn(){
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-VIR3TQN\\SQLEXPRESS;database=tms; user=sa;password=sakshi123;");
			s = connection.createStatement();
			//con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
