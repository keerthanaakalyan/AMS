package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;

public class EmployeeMain {
	public static void main(String args[]) {
		// List<E> list=ArrayList<E>();
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");
		Employee employee = (Employee) applicationContext.getBean("employee");

		Employee employee1 = (Employee) applicationContext.getBean("employee");

		System.out.println(employee + " " + employee1.getAddress());
	}
}
