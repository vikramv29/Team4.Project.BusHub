package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.app.exception.EmptyInputException;
import com.app.model.Customer;
import com.app.repository.CustomerRepository;
import com.app.service.CustomerCRUDService;

@Service
public class CustomerCRUDServiceImpl implements CustomerCRUDService {

	@Autowired
	private CustomerRepository repository;

	@Override
	public Customer addCustomer(Customer customer) {
		
		if(customer.getCustomerEmailId().length() == 0 || customer.getCustomerPassword().length() == 0 || customer.getCustomerName().length() == 0) {
			throw new EmptyInputException("Please enter something");
		}
		
		return repository.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		
		if(customer.getCustomerEmailId().length() == 0 || customer.getCustomerPassword().length() == 0 || customer.getCustomerName().length() == 0) {
			throw new EmptyInputException("Please enter something");
		}
		// TODO Auto-generated method stub
		return repository.save(customer);
	}

	@Override
	public Customer getCustomerBycustomerId(int customerId) {
		// TODO Auto-generated method stub
		return repository.findById(customerId).get();
	}

	@Override
	public void deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		repository.deleteById(customerId);
	}

}
