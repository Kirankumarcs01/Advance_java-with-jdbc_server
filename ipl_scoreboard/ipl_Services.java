package org.svit.ipl_scoreboard;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ipl_Services {

			public void AddData() {
			{
				// load or register driver class
				try {
					Class.forName("org.postgresql.Driver");

					// establishes connection
					String url = "jdbc:postgresql://localhost:5432/ipl";
					String user = "postgres";
					String password = "root";

					Connection connection = DriverManager.getConnection(url, user, password);

					System.out.println(connection);

					// create statement
					Scanner scn = new Scanner(System.in);
					String sql = "INSERT INTO ipl2 VALUES(?,?,?,?,?,?,?)";
					try {
						PreparedStatement ps = connection.prepareStatement(sql);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					System.out.println("enter the id");
					int id = scn.nextInt();

					System.out.println("enter the name");
					String name = scn.next();

					System.out.println("enter  the no.of matchs played");
					int noofmatchsplayed = scn.nextInt();

					System.out.println("enter the won matches");
					int wonmatches = scn.nextInt();

					System.out.println("enter the NRR");
					float NRR = scn.nextFloat();

					System.out.println("enter the no.of matches lost");
					int noofmatcheslost = scn.nextInt();

					System.out.println("enter the points");
					int points = scn.nextInt();

					PreparedStatement ps = connection.prepareStatement(sql);

					ps.setInt(1, id);
					ps.setString(2, name);
					ps.setInt(3, noofmatchsplayed);
					ps.setInt(4, wonmatches);
					ps.setFloat(5, NRR);
					ps.setInt(6, noofmatcheslost);
					ps.setFloat(7, points);

					ps.execute();

					// closing the connection
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
		}

		public void UpdateData() {

			// load or register driver class
			try {
				Class.forName("org.postgresql.Driver");

				// establishes connection
				String url = "jdbc:postgresql://localhost:5432/ipl";
				String user = "postgres";
				String password = "root";

				Connection connection = DriverManager.getConnection(url, user, password);

				System.out.println(connection);

				// create statement
				Scanner scn = new Scanner(System.in);
				String sql = "UPDATE  ipl2 SET name=? WHERE id=?";
				try {
					PreparedStatement ps = connection.prepareStatement(sql);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("update the id");
				int id = scn.nextInt();

				System.out.println("update the name");
				String name = scn.next();

				// System.out.println("update the no.of matchs played");
				// int noofmatchsplayed = scn.nextInt();

				// System.out.println("update the won matches");
				// int wonmatches = scn.nextInt();

				// System.out.println("update the NRR");
				// float NRR= scn.nextFloat();

				// System.out.println("update the no.of matches lost");
				// int noofmatcheslost = scn.nextInt();

				// System.out.println("update the points");
				// int points = scn.nextInt();

				PreparedStatement ps = connection.prepareStatement(sql);

				ps.setInt(2, id);
				ps.setString(1, name);
				// ps.setInt(3, noofmatchsplayed);
				// ps.setInt(4, wonmatches);
				// ps.setInt(5, NRR);
				// ps.setInt(6, noofmatcheslost);
				// ps.setFloat(7, points);

				ps.execute();

				// closing the connection
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

				// establishes connection
				String url = "jdbc:postgresql://localhost:5432/ipl";
				String user = "postgres";
				String password = "root";

				Connection connection = DriverManager.getConnection(url, user, password);

				System.out.println(connection);

				// create statement
				Scanner scn = new Scanner(System.in);
				String sql = "DELETE FROM ipl2 WHERE name=?";
				try {
					PreparedStatement ps = connection.prepareStatement(sql);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// System.out.println("delete the id");
				// int id = scn.nextInt();

				System.out.println("delete the name");
				String name = scn.next();

				// System.out.println("delete the no.of matchs played");
				// int noofmatchsplayed = scn.nextInt();

				// System.out.println("delete the won matches");
				// int wonmatches = scn.nextInt();

				// System.out.println("delete the NRR");
				//Float NRR = scn.nextFloat();

				// System.out.println("delete the no.of matches lost");
				// int noofmatcheslost = scn.nextInt();

				// System.out.println("delete the points");
				// int points = scn.nextInt();

				PreparedStatement ps = connection.prepareStatement(sql);

				// ps.setInt(1, id);
				ps.setString(1, name);
				// ps.setInt(3, noofmatchsplayed);
				// ps.setInt(4, wonmatches);
				// ps.setInt(5, NRR);
				// ps.setInt(6, noofmatcheslost);
				// ps.setFloat(7, points);

				ps.execute();

				// closing the connection
				connection.close();
				System.out.println("DELETE DATA SUCESSFULLY");

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		public void FetchData() {
			// TODO Auto-generated method stub
			try {

				// load/register driver class
				Class.forName("org.postgresql.Driver");

				// establishes connection
				String url = "jdbc:postgresql://localhost:5432/ipl";
				String user = "postgres";
				String password = "root";

				Connection connection = DriverManager.getConnection(url, user, password);

				// executing query
				String sql = "select * from ipl2";
				Statement cs = connection.createStatement();

				boolean p = cs.execute(sql);
				System.out.println(p);

				ResultSet ex = cs.getResultSet();
				while (ex.next()) {
					System.out.println(ex.getInt(1));
					System.out.println(ex.getString(2));
					System.out.println(ex.getInt(3));
					System.out.println(ex.getInt(4));
					System.out.println(ex.getFloat(5));
					System.out.println(ex.getInt(6));
					System.out.println(ex.getInt(7));

					System.out.println("======================");
				}
				// close conenection
				connection.close();
				System.out.println("fetch data successfully");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	