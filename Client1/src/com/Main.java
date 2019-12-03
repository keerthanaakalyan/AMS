package com;

import java.rmi.RemoteException;

import com.model.Employee;

public class Main {

	public static void main(String[] args) {
		CalculationProxy c=new CalculationProxy();
		  Employee e=null;
		  try {
			e=c.getEmployeeById(10l);
		} catch (RemoteException Re) {
			// TODO Auto-generated catch block
			Re.printStackTrace();
		}
		
		System.out.println(e.getEmployeeName());
		try { 
			e=c.getSalary("keerthu");
			System.out.println(e.getEmployeeId()+" "+e.getEmployeeName()+" "+e.getSal());
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
