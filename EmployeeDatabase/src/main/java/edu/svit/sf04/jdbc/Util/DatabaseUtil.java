package edu.svit.sf04.jdbc.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

	//private static final String DRIVER_PATH = " "; 
	private static final String DB_URL = "jdbc:postgresql://localhost:5432/Employee";
	private static final String USER_NAME = "postgres";
    private static final String  PASSWARD = "root";
	
	public  void Databaseutil(){
		// load or register driver class
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection connection = null;
			try {
				connection = DriverManager.getConnection(DB_URL, USER_NAME, PASSWARD);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}
			System.out.println( connection);
	      }catch(ClassNotFoundException ex) {
		       System.out.println("the driver is not loaded"+ex.getMessage());
		       System.out.println("something went wrong"+ex);
		      }
	}
	
	//user define method
	public Connection getConnection()throws SQLException{
		return DriverManager.getConnection(DB_URL,USER_NAME,PASSWARD);
	}
}
