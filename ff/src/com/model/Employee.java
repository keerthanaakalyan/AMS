package com.model;

public class Employee {
    private String EmployeeName;
    private long EmployeeId;
  
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public long getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(long employeeId) {
		EmployeeId = employeeId;
	}
	public Employee(String employeeName, long employeeId) {
		super();
		EmployeeName = employeeName;
		EmployeeId = employeeId;
	}
	

}
