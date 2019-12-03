/**
 * Employee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.model;

public class Employee  implements java.io.Serializable {
    private long employeeId;

    private java.lang.String employeeName;

    private float sal;

    public Employee() {
    }

    public Employee(
           long employeeId,
           java.lang.String employeeName,
           float sal) {
           this.employeeId = employeeId;
           this.employeeName = employeeName;
           this.sal = sal;
    }


    /**
     * Gets the employeeId value for this Employee.
     * 
     * @return employeeId
     */
    public long getEmployeeId() {
        return employeeId;
    }


    /**
     * Sets the employeeId value for this Employee.
     * 
     * @param employeeId
     */
    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }


    /**
     * Gets the employeeName value for this Employee.
     * 
     * @return employeeName
     */
    public java.lang.String getEmployeeName() {
        return employeeName;
    }


    /**
     * Sets the employeeName value for this Employee.
     * 
     * @param employeeName
     */
    public void setEmployeeName(java.lang.String employeeName) {
        this.employeeName = employeeName;
    }


    /**
     * Gets the sal value for this Employee.
     * 
     * @return sal
     */
    public float getSal() {
        return sal;
    }


    /**
     * Sets the sal value for this Employee.
     * 
     * @param sal
     */
    public void setSal(float sal) {
        this.sal = sal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.employeeId == other.getEmployeeId() &&
            ((this.employeeName==null && other.getEmployeeName()==null) || 
             (this.employeeName!=null &&
              this.employeeName.equals(other.getEmployeeName()))) &&
            this.sal == other.getSal();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getEmployeeId()).hashCode();
        if (getEmployeeName() != null) {
            _hashCode += getEmployeeName().hashCode();
        }
        _hashCode += new Float(getSal()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Employee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.com", "Employee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.com", "employeeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.com", "employeeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.com", "sal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
