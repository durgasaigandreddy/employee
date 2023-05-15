package com.customer.domain;

public class Customer extends Address {

	int customerId;
	String firstName;
	String lastName;
	int age;
	String gender;

	public Customer() {
		super();
	}

	public Customer(int addressId, String firstLine, String street, String city, String state, int pincode) {
		super(addressId, firstLine, street, city, state, pincode);
	}

	public Customer(int customerId, String firstName, String lastName, int age, String gender) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", gender=" + gender + ", getAddressId()=" + getAddressId() + ", getFirstLine()="
				+ getFirstLine() + ", getStreet()=" + getStreet() + ", getCity()=" + getCity() + ", getState()="
				+ getState() + ", getPincode()=" + getPincode() + "]";
	}

}
