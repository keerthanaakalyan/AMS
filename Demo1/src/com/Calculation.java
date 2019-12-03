package com;



import java.util.List;

import com.model.Employee;

public class Calculation {
 

 public Employee getEmployeeById(long empNo){
	    Employee employee=null;
	    if(empNo==10){
	    	employee= new Employee("keer",10L,10000);
	    }
	    if(empNo==20){
	    	employee= new Employee("vin",20L,200000);
	    }
	    return employee;
 }
 public Employee getSalary(String empName,List<Employee> employee){
	
	 for(Employee e:employee)
	 {
		 if(e.getEmployeeName().equals(empName))
			 return e;
	 }
	return null;
	 
 }
/* public Employee  getSalary(String empName){
	 Employee employee=null;
	 employee= new Employee("keerthu",10L,45000);
	 return employee;
 }*/
 
}
