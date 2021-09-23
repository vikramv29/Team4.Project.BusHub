package com.app.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Bus {
	@Id
	@GeneratedValue
	private int busId;
	private String busName;
	private String busSource;
	private String busDestination;
	private Date busOnBoardDate;
	private double busPrice;
	private Date busArrivalDate;
	private String busType;
	private String busStatus;
}
