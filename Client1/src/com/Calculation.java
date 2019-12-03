/**
 * Calculation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public interface Calculation extends java.rmi.Remote {
    public com.model.Employee getEmployeeById(long empNo) throws java.rmi.RemoteException;
    public com.model.Employee getSalary(java.lang.String empName) throws java.rmi.RemoteException;
}
