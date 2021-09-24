package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Bus;
import com.app.model.Ticket;
import com.app.service.TicketCRUDService;
import com.app.service.impl.TicketCRUDServiceImpl;

@RestController
public class TicketCRUDController {

	@Autowired
	private TicketCRUDService service;
	
	@PostMapping("/ticket")
	public Ticket addTicket(@RequestBody Ticket ticket) {
		return service.addTicket(ticket);
	}
	@GetMapping("/ticket/ticketId/{ticketId}")
	public Ticket getTicketByticketId(@PathVariable int ticketId) {
		return service.getTicketByticketId(ticketId);
	}
}
