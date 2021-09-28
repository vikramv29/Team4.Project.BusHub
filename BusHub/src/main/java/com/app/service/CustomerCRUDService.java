package com.app.service;

import com.app.model.Customer;

public interface CustomerCRUDService {

	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer) ;
	public Customer getCustomerBycustomerId(int customerId);
	public void deleteCustomer(int customerId) ;
	
} 
