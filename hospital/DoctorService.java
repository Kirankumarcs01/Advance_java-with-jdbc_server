package org.svit.hospital;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DoctorService {
	
	

	
		private static final String url = "jdbc:postgresql://localhost:5432/svit";
		private static final String user = "postgres";

		private static final String passward = "root";
		


		
			public void addData()
			{
				// load or register driver class
				try {
					Class.forName("org.postgresql.Driver");
					
					Connection connection = DriverManager.getConnection(url, user, passward);
					
					
					System.out.println( connection);
					
		          //create statement
					Scanner scn=new Scanner(System.in);
					String sql="INSERT INTO hospital VALUES(?,?,?,?)";
					try {
						PreparedStatement ps=connection.prepareStatement(sql);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("enter the id");
					int id =scn.nextInt();
					System.out.println("enter the name");
					String name=scn.next();
					
					System.out.println("enter  the specialist");
					String specialist=scn.next();
					
					System.out.println("enter the salary");
					int salary=scn.nextInt();
					
		            PreparedStatement ps= connection.prepareStatement(sql);
					
					ps.setInt(1,id);
					ps.setString(2,name);
					ps.setString(3, specialist);
					ps.setInt(4, salary);
					ps.execute();
					
					
					 //closing the connection
					connection.close();
					System.out.println("insert data successfully");
					
						
						
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
					
					
					
						} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			public void DeleteData() {
				// load or register driver class
				try {
					Class.forName("org.postgresql.Driver");
					
					Connection connection = DriverManager.getConnection(url, user, passward);
					
					
					System.out.println( connection);
					
		          //create statement
					Scanner scn=new Scanner(System.in);
					String sql="DELETE FROM hospital  WHERE id=?";
					try {
						PreparedStatement ps=connection.prepareStatement(sql);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("enter the id");
					int id =scn.nextInt();
					//System.out.println("enter the name");
					//String name=scn.next();
					
					//System.out.println("enter  the specialist");
					//String specialist=scn.next();
					
					//System.out.println("enter the salary");
					//int salary=scn.nextInt();
					
		            PreparedStatement ps= connection.prepareStatement(sql);
					
					ps.setInt(1,id);
					//ps.setString(2,name);
					//ps.setString(3, specialist);
					//ps.setInt(1, salary);
					ps.execute();
					
					
					 //closing the connection
					
					connection.close();
					System.out.println("DELETE DATA SUCCESSFULLY");
						
						
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
					
					
					
						} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			        
				}
			public void UpdateData() {
				// load or register driver class
				try {
					Class.forName("org.postgresql.Driver");
					
					Connection connection = DriverManager.getConnection(url, user, passward);
					
					
					System.out.println( connection);
					
		          //create statement
					Scanner scn=new Scanner(System.in);
					String sql="UPDATE hospital SET salary=? WHERE id=?";
					try {
						PreparedStatement ps=connection.prepareStatement(sql);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("enter the id");
					int id =scn.nextInt();
					//System.out.println("enter the name");
					//String name=scn.next();
					
					//System.out.println("enter  the specialist");
					//String specialist=scn.next();
					
					System.out.println("enter the salary");
					int salary=scn.nextInt();
					
		            PreparedStatement ps= connection.prepareStatement(sql);
					
					ps.setInt(2,id);
					//ps.setString(2,name);
					//ps.setString(3, specialist);
					ps.setInt(1, salary);
					ps.execute();
					
					
					 //closing the connection
					
					
						
						
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
					
					
					
						} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			        
				}
			public void FetchData()
			{
				// TODO Auto-generated method stub
				try {
					Class.forName("org.postgresql.Driver");


					Connection connection = DriverManager.getConnection(url, user, passward);

					String sql = "select * from hospital";
					Statement cs = connection.createStatement();

					boolean p = cs.execute(sql);
					System.out.println(p);

					ResultSet ex = cs.getResultSet();
					while (ex.next()) {
						System.out.println(ex.getInt(1));
						System.out.println(ex.getString(2));
						System.out.println(ex.getString(3));
						System.out.println(ex.getInt(4));
						System.out.println("======================");
					}
					connection.close();
					System.out.println("fetch data successfully");
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			
	}



