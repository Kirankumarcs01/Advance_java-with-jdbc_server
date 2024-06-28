package edu.svit.sf04.jdbc.model;

public class Employee {

	private int emp_Id;
	private String empName;
	private String empDepartment;
	private double empSalary;
	public Object Department;
	public String empLocation;
	
	//conmstructors
	/**
	 * @param empId
	 * @param empName
	 * @param empDepartment
	 * @param DoubleSlary
	 */
	public Employee(int empId, String empName, String empDepartment, Double empSlary,String empLocation) {
		this.emp_Id = empId;
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.empSalary = empSlary;
		this.empLocation = empLocation;
	}//
	//geter and setter
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return emp_Id;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.emp_Id = emp_Id;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the empDepartment
	 */
	public String getEmpDepartment() {
		return empDepartment;
	}
	/**
	 * @param empDepartment the empDepartment to set
	 */
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	/**
	 * @return the empSalary
	 */
	public double getEmpSalary() {
		return empSalary;
	}
	/**
	 * @param empSalary the empSalary to set
	 */
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	/**
	 * @param empSalary the empSalary to set
	 */
	public void setEmpSalary(String empLocation) {
		this.empLocation = empLocation;
	}
	public String getEmpLocation() {
		// TODO Auto-generated method stub
		return null;
	}
}