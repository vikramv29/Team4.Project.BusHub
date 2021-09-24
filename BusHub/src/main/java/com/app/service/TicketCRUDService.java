package com.app.service;

import com.app.model.Ticket;

public interface TicketCRUDService {

	public Ticket addTicket(Ticket ticket);

	public Ticket getTicketByticketId(int ticketId);
}
