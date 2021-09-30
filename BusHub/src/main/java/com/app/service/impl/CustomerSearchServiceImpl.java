package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.exception.EmptyInputException;
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

		if (customerName.isEmpty() || customerName.length() == 0 || customerName == null)
			throw new EmptyInputException("Input fields are empty");
		System.out.println(customerName);

		return repository.findBycustomerName(customerName);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Customer getCustomerBycustomerEmailId(String customerEmailId) {
		// TODO Auto-generated method stub
		return repository.findBycustomerEmailId(customerEmailId);
	}

}
