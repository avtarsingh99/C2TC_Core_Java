package com.tnsif.daythree;

public class Customer {
	
	private String customerName, city;
	private int id;
	//constructor
	public Customer() {
	System.out.println("Default Constructor....");}

	public Customer(String customerName, String city, int id) {
		this.customerName = customerName;
		this.city = city;
		this.id = id;
		System.out.println("Parametrized Constructor....");
	}


	//getter and setter
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", city=" + city + ", id=" + id + "]";
	}

}
