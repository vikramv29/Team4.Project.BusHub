package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Bus;
import com.app.model.Customer;
import com.app.service.CustomerSearchService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerSearchController {
	
	@Autowired
	private CustomerSearchService service;
	
	@PostMapping("/logincheck")
	public Customer checklogincredentials(@RequestBody Customer customer)
	{
		Customer c=service.getCustomerBycustomerEmailId(customer.getCustomerEmailId());
		if(c!=null)
		{
		if((customer.getCustomerEmailId().equals(c.getCustomerEmailId())) && (customer.getCustomerPassword().equals(c.getCustomerPassword())))
			return c;
		else
			{System.out.println("Wrong password");
			return null;}
		}
		else
		{
			System.out.println("Does not exist");
			return null;
		}
	}
	
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
