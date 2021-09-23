package com.app.service;

import java.util.List;

import com.app.model.Bus;

public interface BusSearchService {

	List<Bus> getAllBuses();

	List<Bus> getAllBusesByName(String busName);

	List<Bus> getAllBusesBySource(String busSource);

	List<Bus> getAllBusesByDestination(String busDestination);

	List<Bus> getAllBusesByType(String busType);
}
