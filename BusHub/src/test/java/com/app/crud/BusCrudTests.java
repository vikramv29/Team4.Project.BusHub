package com.app.crud;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.model.Bus;
import com.app.model.Customer;
import com.app.repository.BusRepository;
import com.app.service.BusCRUDService;

@RunWith(SpringRunner.class)
public class BusCrudTests {
	
	@Autowired
	private BusCRUDService service;
	
	@MockBean
	private BusRepository repository;
	
//	@Test
//	public void addBusTest() {
//		Bus bus = new Bus(21, "Virat", "Delhi", "Lucknow", Date.parse("2020-09-02"), 2323.42, Date.parse("2020-08-29"), "AC", "en route", 3.5);	
//		when(repository.save(bus)).thenReturn(bus);
//		assertEquals(bus.getBusId(), service.addBus(bus).getBusId());
//	}
	
//	@Test
//	public void  deleteBusTest() {
//		int busId = 9;
//		service.deleteBus(busId);
//		verify(repository, times(1)).deleteById(busId);
//	}
	
}


