package com.customer.domain;

public class Address {

	int addressId;
	String firstLine;
	String street;
	String city;
	String state;
	int pincode;

	public Address() {

	}

	public Address(int addressId, String firstLine, String street, String city, String state, int pincode) {
		super();
		this.addressId = addressId;
		this.firstLine = firstLine;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getFirstLine() {
		return firstLine;
	}

	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", firstLine=" + firstLine + ", street=" + street + ", city=" + city
				+ ", state=" + state + ", pincode=" + pincode + "]";
	}

}
