package com;



import com.model.Employee;

public class Calculator {
 public String getName(){
	 return "Break!!!!!!!!!!!!!!!!!!";
 }
 public int add(int num1,int num2){
	 return num1*num2;
 }

 public Employee getEmployeeById(long empNo){
	    Employee employee=null;
	    if(empNo==10){
	    	employee= new Employee("keer",10L);
	    }
	    if(empNo==20){
	    	employee= new Employee("vin",20L);
	    }
	    return employee;
 }

}
