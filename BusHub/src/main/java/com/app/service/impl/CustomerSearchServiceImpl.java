package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Customer;
import com.app.repository.CustomerRepository;
import com.app.service.CustomerSearchService;

@Service
public class CustomerSearchServiceImpl implements CustomerSearchService {

	@Autowired
	private CustomerRepository repository;

	@Override
	public List<Customer> getCustomersBycustomerName(String customerName) {
		// TODO Auto-generated method stub
		return repository.findBycustomerName(customerName);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
