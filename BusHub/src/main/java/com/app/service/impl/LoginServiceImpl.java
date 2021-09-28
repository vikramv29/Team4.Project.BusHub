package com.app.service.impl;

import org.springframework.stereotype.Service;

import com.app.model.Customer;
import com.app.service.CustomerSearchService;
import com.app.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	private CustomerSearchService service;

	@Override
	public Customer isValidLogin(String customerEmailId, String customerPassword) {

		Customer customer = service.getCustomerBycustomerEmailId(customerEmailId);

		if (customer.getCustomerPassword().equals(customerPassword)) {

			System.out.println("Customer logged in successfully");
			
		} else {
			customer = null;
			System.out.println("User not found, Please register");
		}
		return customer;
	}

}
