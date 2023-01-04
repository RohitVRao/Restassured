package genericUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtility 
{
	Connection conn = null;
	public void connecttoDB() throws Throwable {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
		
	
	}
	
	
	
	
	public String executeQueryAndGetData(String query, int ColumnIndex, String expdata) throws SQLException
	{
		boolean flag = false;
		
		ResultSet result = conn.createStatement().executeQuery(query);
		while (result.next())
		{
			String data = result.getString(ColumnIndex);
			if(data.equalsIgnoreCase(expdata))
			{
				flag = true;
				break;
						
			}
			
		}
		if(flag)
		{
			System.out.println(expdata+"---->data verified");
			return expdata;
		}
		else
		{
			System.out.println(expdata+"---->data not verified");
}
		return " ";
		
	}
	 public void closeDB() throws SQLException
	   {
		   conn.close();
	   }
	 
}
