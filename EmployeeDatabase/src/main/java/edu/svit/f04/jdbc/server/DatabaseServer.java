package edu.svit.f04.jdbc.server;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import edu.svit.sf04.jdbc.Util.DatabaseUtil;
import edu.svit.sf04.jdbc.Util.QueryUtil;
import edu.svit.sf04.jdbc.model.Employee;

public class DatabaseServer {
	DatabaseUtil dbUtil=new DatabaseUtil();

	
	public void insertEmployee(Employee emp)throws SQLException
	{
		try(Connection con = dbUtil.getConnection();
			PreparedStatement ps = con.prepareStatement(QueryUtil.insertEmployeeQuery());){
				ps.setInt(1, emp.getEmpId());
				ps.setString(2, emp.getEmpName());
				ps.setString(3, emp.getEmpDepartment());
				ps.setDouble(4, emp.getEmpSalary());
				ps.setString(5, emp.getEmpLocation());
				int rows = ps.executeUpdate();
				if(rows>0) 
				{
					System.out.println("Record is inserted");
        	
				}
				else 
				{
					System.out.println("no record is inserted");
				}
			}
		}
     
       
     //retrieve all the record from the database table
	  public void getAlltheEmployee1() throws SQLException
      {
        	try(Connection con = dbUtil.getConnection();
        	
        		Statement smt = con.createStatement();
        		ResultSet rs= smt.executeQuery(QueryUtil.selectAllTheEmployeesQuery());){
        			while(rs.next()){
        				
						printEmployee1(new Employee(rs.getInt("empId"),
        				rs.getString("empName"),
        				rs.getString("empDepartment"),
        				rs.getDouble("empSalary"),
        				rs.getString("empLocation")));
        				
        				
        			}
        		}
         }
       private void printEmployee1(Employee employee) {
		// TODO Auto-generated method stub
		
	}


	//to retrieve employee details for a particular id
	  public boolean getEmployeeById(int id)throws SQLException{
		  boolean isFound=false;
		  try(Connection con=dbUtil.getConnection();
				  Statement smt=con.createStatement();
				  ResultSet rs = smt.executeQuery(QueryUtil.selectEmployeeById(id));){
			  	  if(rs.next()) {
			  		  isFound=true;
			  		  printEmployee1(new Employee(rs.getInt("emplId"),
			  				  rs.getString("empName"),
			  				  rs.getString("empDepartment"),
			  				  rs.getDouble("empSalary"),
			  				  rs.getString("empLocation")));
			  	  }else {
			  		  System.out.println("record is not available for id: "+id);
			  	  }
		   }
		return isFound;
	  }
		  
	  public void printEmployee(Employee emp)
	  {
        System.out.println("employee id: "+emp.getEmpId());
       	System.out.println("employee name: "+emp.getEmpName());
       	System.out.println("employee department: "+emp.getEmpDepartment());
       	System.out.println("employee salary: "+emp.getEmpSalary());
        	
      }
	  
	  //to delete  the record from the database table by passing the employee id
	  public void deleteEmployeeById(int id) throws SQLException
	  {
		  try(Connection con = dbUtil.getConnection();
				  Statement smt=con.createStatement();){
				int rows = smt.executeUpdate(QueryUtil.deleteEmployeeById(id));
				  if(rows>0)
				  {
					 System.out.println("record is deleted successfully");
				  }else {
					  
					  System.out.println("something went wrong");
				  }
		  }
	  }
	  
	  //update record
	  
	  public void UpdateEmployee(Employee emp)throws SQLException
		{
			try(Connection con = dbUtil.getConnection();
				PreparedStatement ps = con.prepareStatement(QueryUtil.UpdateEmployeeById(emp.getEmpId()));){
					ps.setString(1, emp.getEmpName());
					ps.setString(2, emp.getEmpDepartment());
					ps.setDouble(3, emp.getEmpSalary());
					ps.setString(4, emp.getEmpLocation());
					int rows = ps.executeUpdate();
					if(rows>0) 
					{
						System.out.println("Record is inserted");
	        	
					}
					else 
					{
						System.out.println("no record is inserted");
					}
			  }
		}


	public void getAllEmployee() {
		// TODO Auto-generated method stub
		
	}
}
