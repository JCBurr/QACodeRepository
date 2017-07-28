//package Databases;
//import java.sql.*;
//
//public class JavaMain
//{
//	public static void main(String args[])
//	{
//		try
//		{
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","root");
//			Statement stm = con.createStatement();
//			ResultSet rs = stm.executeQuery("Select * from qa");
//			while(rs.next())
//					{
//					System.out.println(rs.getInt(0));
//					}
//		} catch (SQLException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}
package Databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaMain
{
	public static void main(String[] args) throws SQLException
	{
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?useSSL=false", "root","root");
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT  from firsttesttable");
			while (rs.next())
			{
				System.out.println(rs.getInt(1));
			}
			con.close();
		} catch (

		InstantiationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally
		{
		}
	}
}