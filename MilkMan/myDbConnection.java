package MilkMan;

import java.sql.Connection;
import java.sql.DriverManager;

public class myDbConnection
{
	public static Connection doConnect()
	{
		Connection con=null; //LRV
		try {
			
			 Class.forName("com.mysql.jdbc.Driver");
			 //														    databaseName      password
			 con=	DriverManager.getConnection("jdbc:mysql://localhost/info","root","Nav1een.p");
			 System.out.println("Connected"); 
		 
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return con;
	}

	public static void main(String[] args) 
	{
		doConnect();

	}

}
