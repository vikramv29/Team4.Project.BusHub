package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.app.model.Customer;
import com.app.repository.CustomerRepository;
import com.app.service.CustomerCRUDService;

@Service
public class CustomerCRUDServiceImpl implements CustomerCRUDService {

	@Autowired
	private CustomerRepository repository;

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repository.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repository.save(customer);
	}

	@Override
	public Customer getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return repository.findById(customerId).get();
	}

	@Override
	public void deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		repository.deleteById(customerId);
	}

}
