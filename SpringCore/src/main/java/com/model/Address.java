package com.model;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Address implements Serializable{
 private int doorNo;
 private String street;
 private String city;
public Address() {
	super();
	System.out.println("Address Constructor");
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Address [doorNo=" + doorNo + ", street=" + street + ", city=" + city + "]";
}
public int getDoorNo() {
	return doorNo;
}
@Value("420")
public void setDoorNo(int doorNo) {
	this.doorNo = doorNo;
}

public String getStreet() {
	return street;
}
@Value("Police")
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
@Value("Tn")
public void setCity(String city) {
	this.city = city;
}
 
}
