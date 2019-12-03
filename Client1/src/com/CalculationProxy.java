package com;

public class CalculationProxy implements com.Calculation {
  private String _endpoint = null;
  private com.Calculation calculation = null;
  
  public CalculationProxy() {
    _initCalculationProxy();
  }
  
  public CalculationProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculationProxy();
  }
  
  private void _initCalculationProxy() {
    try {
      calculation = (new com.CalculationServiceLocator()).getCalculation();
      if (calculation != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculation)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculation)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculation != null)
      ((javax.xml.rpc.Stub)calculation)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.Calculation getCalculation() {
    if (calculation == null)
      _initCalculationProxy();
    return calculation;
  }
  
  public com.model.Employee getEmployeeById(long empNo) throws java.rmi.RemoteException{
    if (calculation == null)
      _initCalculationProxy();
    return calculation.getEmployeeById(empNo);
  }
  
  public com.model.Employee getSalary(java.lang.String empName) throws java.rmi.RemoteException{
    if (calculation == null)
      _initCalculationProxy();
    return calculation.getSalary(empName);
  }
  
  
}