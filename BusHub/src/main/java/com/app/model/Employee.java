package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Employee {
	@Id
	private String employeeEmailId;
	private String employeePassoword;
}
