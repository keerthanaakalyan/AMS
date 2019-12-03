package com.model;

public class Employee {
    private String EmployeeName;
    private long EmployeeId;
    private float sal;
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
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public Employee(String employeeName, long employeeId, float sal) {
		super();
		EmployeeName = employeeName;
		EmployeeId = employeeId;
		this.sal = sal;
	}
	

}
