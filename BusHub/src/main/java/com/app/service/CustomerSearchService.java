package com.app.service;

import java.util.List;

import com.app.model.Customer;

public interface CustomerSearchService {

	List<Customer> getAllCustomers();
	List<Customer> getCustomerByName(String customerName);
}
