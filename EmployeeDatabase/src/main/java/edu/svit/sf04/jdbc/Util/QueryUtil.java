package edu.svit.sf04.jdbc.Util;

public class QueryUtil {

	//query to insert
		public static String insertEmployeeQuery() {
			return "INSERT INTO employee(emp_ame,emp_department,emp_salary,emp_Location)VALUES(?,?,?,?,?)";
		}
		
		//query to retrieve all the employee records 
		public static String selectAllTheEmployeesQuery()
		{
			return "SELECT * From Employee";
		}
		
		//query to retrieve  the employee records  at particular 
	
		public static String selectEmployeeById(int employeeId) {
			return "SELECT * FROM emp_Id=" +employeeId;
		}
		
		//query to delete the employee records  by particular employee id
		
		public static String deleteEmployeeById(int employeeId) {
			return "DELETE FROM Employee WHERE employee_id=" +employeeId;
		}
		
		//query to update  the employee records by particular employee id
	
		public static String UpdateEmployeeById(int employeeId) {
			return "UPDATE Employee SET  employee_name = ?,employee_Location = ?,employee_salary = ? WHERE employee_id" +employeeId;
		}

		

		 
		
	

		
		

}
