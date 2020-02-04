package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO 
{
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//step 2: Establish the connection with oracle
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SUVAM","scott","tiger");
	}
}
