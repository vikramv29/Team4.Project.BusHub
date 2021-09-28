package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Ticket;

import com.app.service.TicketSearchService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TicketSearchController {

	@Autowired
	private TicketSearchService service;

	
	@GetMapping("/tickets")
	public List<Ticket> getAllTickets() {
		return service.getAllTickets();
	}
}
