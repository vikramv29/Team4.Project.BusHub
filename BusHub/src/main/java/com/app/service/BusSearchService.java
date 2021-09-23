package com.app.service;

import java.util.List;

import com.app.model.Bus;

public interface BusSearchService {

	List<Bus> getAllBuses();
	List<Bus> getAllBusesByName(String name) ;
	List<Bus> getAllBusesBySource(String busSource);
}
