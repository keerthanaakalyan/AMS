/**
 * Calculator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public interface Calculator extends java.rmi.Remote {
    public int add(int num1, int num2) throws java.rmi.RemoteException;
    public java.lang.String getName() throws java.rmi.RemoteException;
    public com.model.Employee getEmployeeById(long empNo) throws java.rmi.RemoteException;
}
