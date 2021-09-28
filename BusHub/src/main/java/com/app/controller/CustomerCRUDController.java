package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Customer;
import com.app.service.CustomerCRUDService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerCRUDController {

	@Autowired
	private CustomerCRUDService service;

	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}

	@GetMapping("/customer/customerId/{customerId}")
	public Customer getCustomerById(@PathVariable int customerId) {
		return service.getCustomerBycustomerId(customerId);
	}

	@DeleteMapping("/cusotmer/customerId/{customerId}")
	public void deleteCustomer(@PathVariable int customerId) {
		service.deleteCustomer(customerId);
	}

	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return service.updateCustomer(customer);
	}
	
}
