package com.app.model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Ticket {

	@Id
	private int ticketId;
	@OneToMany(mappedBy = "customer")
	private int customerId;
	@OneToMany(mappedBy = "bus")
	private int busId;
	private int noOfPassengers;
	private double totalPrice;
}
