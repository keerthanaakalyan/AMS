package com;

import java.rmi.RemoteException;

import com.model.Employee;

public class TestMyService {
  public static void main(String args[]) {
	  CalculatorProxy c=new CalculatorProxy();
	  Employee e=null;
	  try {
		e=c.getEmployeeById(10l);
	} catch (RemoteException Re) {
		// TODO Auto-generated catch block
		Re.printStackTrace();
	}
	
	System.out.println(e.getEmployeeName());
}
}
