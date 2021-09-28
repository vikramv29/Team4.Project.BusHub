package com.app.service;

import com.app.model.Customer;

public interface LoginService {
	public Customer isValidLogin(String customerEmailId, String customerPassword);
}
