package com.app.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Bus {
	public Bus(int busId2, String busName2, String busSource2, String busDestination2, long parse, double busPrice2,
			long parse2, String busType2, String busStatus2, double busRating2) {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue
	private int busId;
	private String busName;
	private String busSource;
	private String busDestination;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date busOnBoardDate;
	private double busPrice;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date busArrivalDate;
	private String busType;
	private String busStatus;
	private double busRating;
}
