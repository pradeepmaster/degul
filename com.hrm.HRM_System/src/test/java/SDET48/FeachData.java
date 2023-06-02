package SDET48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class FeachData {

	public static void main(String[] args) throws SQLException {

		Connection conn=null;
		String name="sachin";
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			conn=DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects,'root@%','root'");
			Statement stat=conn.createStatement();
			String query="select * from sanjaydata";
			ResultSet result = stat.executeQuery(query);
			boolean flag=false;
			while(result.next()) {
				String data=result.getString(1);
				if(data.contains(name)) {
					System.out.println("data is present");
					flag=true;
					break;
				}
			if(!flag)System.out.println("data not present");
			}
		}finally {conn.close();}
	}

}
