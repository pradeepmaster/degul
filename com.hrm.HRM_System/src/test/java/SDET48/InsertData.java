package SDET48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class InsertData {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/id322", "root", "root");
			Statement state = conn.createStatement();
			String query = "insert into pavan values('Raju','Male')";
			int result = state.executeUpdate(query);
			if (result == 1)
				System.out.println("data added");
			else
				System.out.println("Not added");

		} finally {
			conn.close();
		}
	}
}
