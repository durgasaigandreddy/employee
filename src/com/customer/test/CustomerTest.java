package com.customer.test;

import com.customer.domain.Customer;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setCustomerId(1);
		customer.setFirstName("java");
		customer.setLastName("oops");
		customer.setAge(22);
		customer.setGender("male");

		customer.setAddressId(1);
		customer.setFirstLine("gvshfg");
		customer.setStreet("gffyhu");
		customer.setState("ap");
		customer.setCity("vizag");
		customer.setPincode(534201);

		System.out.println("Customer--->" + customer);

	}
}
