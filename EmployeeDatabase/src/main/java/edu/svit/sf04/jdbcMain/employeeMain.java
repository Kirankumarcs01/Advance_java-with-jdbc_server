package edu.svit.sf04.jdbcMain;

import java.sql.SQLException;
import java.util.Scanner;

import edu.svit.f04.jdbc.server.DatabaseServer;
import edu.svit.sf04.jdbc.model.Employee;

public class employeeMain {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DatabaseServer dbService= new DatabaseServer();
		try(Scanner sc= new Scanner(System.in);){
			boolean isRunning=true;
			while (isRunning) {
				System.out.println("Enter your choice");
				System.out.println("1. Insert");
				System.out.println("2. Select all");
				System.out.println("3. Select employee by Id");
				System.out.println("4. Delete employee");
				System.out.println("5. Update employee");
				System.out.println("6. Exit");

				int choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {
				case 1:
					System.out.println("Enter name, address, salary");
					Employee emp=new Employee(sc.nextInt(), sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),sc.nextLine() );
					dbService.insertEmployee(emp);
					break;
				case 2:
					dbService.getAllEmployee();
					break;
				case 3:
					System.out.println("enter the employee id");
					dbService.getEmployeeById(Integer.parseInt(sc.nextLine()));
					break;
				case 4:
					System.out.println("enter the employee id");
					dbService.deleteEmployeeById(Integer.parseInt(sc.nextLine()));
					break;
				case 5:
					System.out.println("enter the employee id");
					int updateId=Integer.parseInt(sc.nextLine());
					  boolean isFound=dbService.getEmployeeById(updateId);
					
					if(isFound) {
						System.out.println("enter the name, address, salary");
						Employee employee = new Employee(updateId,sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),sc.nextLine());
						dbService.UpdateEmployee(employee);
					}
					break;
				case 6:
					System.out.println("Thank you fro using the application!! visit again");
					isRunning=false;
					
					break;
				default:
					System.out.println("Incorrect choice!, please enter a valid choice");
					break;
				}
			}
		}
		}


}
