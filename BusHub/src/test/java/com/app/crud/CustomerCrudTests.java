package com.app.crud;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.model.Customer;
import com.app.repository.CustomerRepository;
import com.app.service.CustomerCRUDService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerCrudTests {
	
	@Autowired
	private CustomerCRUDService service;
	
	@MockBean
	private CustomerRepository repository;
	
	@Test
	public void addCustomerTest() {
		Customer customer =  new Customer(6, "Himanshu", "himanshu@gmail.com", "rajput");
		
		when(repository.save(customer)).thenReturn(customer);
		assertEquals(customer, service.addCustomer(customer));
		
	}
	
	@Test
	public void updateCustomerTest() {
		Customer customer = new Customer(7, "Ravi", "ravi@gmail.com", "kumar");
		when(repository.save(customer)).thenReturn(customer);
		assertEquals(customer.getCustomerName(), service.updateCustomer(customer).getCustomerName());
	}
	
	@Test
	public void getCustomerBycustomerIdTest() {
		int customerId = 8;
		//when(repository.findById(customerId).get()).thenReturn(new Customer(8, "Arjun", "arjun@gmail.com", "arjun"));
		service.getCustomerBycustomerId(customerId);
		verify(repository, times(1)).getOne(customerId);
		//assertEquals(customerId, service.getCustomerBycustomerId(customerId).getCustomerId());
	}
	
	@Test
	public void  deleteCustomerTest() {
		int customerId = 9;
		service.deleteCustomer(customerId);
		verify(repository, times(1)).deleteById(customerId);
	}
	
}
