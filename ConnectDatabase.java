package multisecure;



import java.sql.*;


public  class ConnectDatabase

{
	public static Statement st1;
	public ConnectDatabase()

	{

		try
		{

                    Class.forName("com.mysql.jdbc.Driver");

	
			Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/multisecure", "root", "");
			st1=con1.createStatement();
		}
		catch(Exception e)
		{
			System.out.println("Exception:" + e );
		}
	}

}	
	
	



