package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Ticket;
import com.app.repository.CustomerRepository;
import com.app.repository.TicketRepository;
import com.app.service.TicketCRUDService;

@Service
public class TicketCRUDServiceImpl implements TicketCRUDService {

	@Autowired
	TicketRepository repository;

	@Override
	public Ticket addTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return repository.save(ticket);
	}

	@Override
	public Ticket getTicketByticketId(int ticketId) {
		// TODO Auto-generated method stub
		return repository.findById(ticketId).get();
	}

}
