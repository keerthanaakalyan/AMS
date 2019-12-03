package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class Employee {
	private int empNo;
	private String empName;
	private float salary;
	@Autowired
	private Address address;

	public Employee() {
		super();
		System.out.println("Non parameter");
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(@Value("121")int empNo,@Value("leela") String empName,@Value("8700") float salary, Address address) {
		super();
		System.out.println("Parameter...");
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", salary=" + salary + ", address=" + address
				+ "]";
	}

}
