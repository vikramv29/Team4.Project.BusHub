package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Ticket;
import com.app.repository.TicketRepository;
import com.app.service.TicketSearchService;

@Service
public class TicketSearchServiceImpl implements TicketSearchService {

	@Autowired
	private TicketRepository repository;

	@Override
	public List<Ticket> getAllTickets() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
