package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Bus;
import com.app.model.Customer;
import com.app.service.CustomerSearchService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerSearchController {
	
	@Autowired
	private CustomerSearchService service;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers(){
		return service.getAllCustomers();
	}
	
	@GetMapping("/customers/customerName/{customerName}")
	public List<Customer> getCustomersBycustomerName(@PathVariable String customerName){
		return service.getCustomersBycustomerName(customerName);
	}
	
	@GetMapping("/customers/customerEmailId/{customerEmailId}")
	public Customer getCustomersByEmailId(@PathVariable String customerEmailId){
		return service.getCustomerBycustomerEmailId(customerEmailId);
	}
	
	//@GetMapping("/customers/login/{customerEmailId}{customerPassword}")
	
}
