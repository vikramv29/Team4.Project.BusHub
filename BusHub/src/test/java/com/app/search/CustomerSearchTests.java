package com.app.search;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.model.Bus;
import com.app.model.Customer;
import com.app.repository.BusRepository;
import com.app.repository.CustomerRepository;
import com.app.service.BusCRUDService;
import com.app.service.BusSearchService;
import com.app.service.CustomerSearchService;


@RunWith(SpringRunner.class)
@SpringBootTest
class CustomerSearchTests {
	
	@Autowired
	private CustomerSearchService service;
	
	@MockBean
	private CustomerRepository repository;
	
	@Test
	public void getAllCustomersTest() {
		when(repository.findAll()).thenReturn(Stream.of(new Customer(1, "Nikhil", "nikhil@gmail.com", "sinha")
				, new Customer(2, "Vikram", "vikram@gmail.com", "verma")).collect(Collectors.toList()));
		assertEquals(2, service.getAllCustomers().size());
	}
	
	@Test
	public void getAllCustomersTest_FalseCase() {
		when(repository.findAll()).thenReturn(Stream.of(new Customer(1, "Nikhil", "nikhil@gmail.com", "sinha")
				, new Customer(2, "Vikram", "vikram@gmail.com", "verma")
				, new Customer(3, "Mourya", "mourya@gmail.com", "krishna"))
				.collect(Collectors.toList()));
		assertNotEquals(2, service.getAllCustomers().size());
	}
	
	@Test
	public void getCustomersBycustomerNameTest() {
		String customerName = "Nikhil";
		when(repository.findBycustomerName(customerName)).thenReturn(Stream.of(new Customer(4, "Nikhil", "nikhil@yahoo.com", "sinha"))
				.collect(Collectors.toList()));
		assertEquals(1, service.getCustomersBycustomerName(customerName).size());
	}

	@Test
	public void getCustomerByEmailIdTest() {
		String customerEmailId = "mourya@gmail.com";
		when(repository.findBycustomerEmailId(customerEmailId)).thenReturn(new Customer(5, "Mourya", "mourya@gmail.com", "krishna"));
		assertEquals(customerEmailId, service.getCustomerBycustomerEmailId(customerEmailId).getCustomerEmailId());
	}
	
}
