package hrmGenericUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;


public class DataBaseUtility {
	Connection con;
	public void connectToDB() throws SQLException {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
//		con = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects,'root@%','root'");
	}
	
	public void closeDB() throws SQLException {
		con.close();
	}
}
