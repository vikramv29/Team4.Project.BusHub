package com.app.service;

import com.app.model.Bus;
import com.app.model.Employee;

public interface BusCRUDService {

	Bus addBus(Bus bus);
	Bus updateBus(Bus bus);
	Bus getBusById(int busId);
	void deleteBus(int busId);
}
