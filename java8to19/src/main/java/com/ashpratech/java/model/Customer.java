package com.ashpratech.java.model;

public class Customer {
	private String customerID;
	private String firstName;
	private String middleName;
	private String lastName;
	private String city;
	private String pinCode;
	private String state;
	private String country;
	
	public Customer(String customerID, String firstName, String middleName, String lastName, String city, String pinCode, String state,
			String country) {
		super();
		this.customerID = customerID;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.city = city;
		this.pinCode = pinCode;
		this.state = state;
		this.country = country;
	}
	
	public String getCustomerID() {
		return customerID;
	}

	public String getFirstName() {
		return firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getCity() {
		return city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	
	
}
