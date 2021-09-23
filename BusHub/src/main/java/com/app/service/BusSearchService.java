package com.app.service;

import java.util.List;

import com.app.model.Bus;

public interface BusSearchService {

	List<Bus> getAllBuses();

	List<Bus> getBusesByName(String busName);

	List<Bus> getBusesBySource(String busSource);

	List<Bus> getBusesByType(String busType);
}
