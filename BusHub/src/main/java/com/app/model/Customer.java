package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Customer {
	@Id
	@GeneratedValue
	private int customerId;
	private String customerName;
	private String customerEmailId;
	private String customerPassword;

}
