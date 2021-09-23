package com.app.service;

import java.util.List;

import com.app.model.Bus;

public interface BusSearchService {

	List<Bus> getAllBuses();

	List<Bus> getBusesBybusName(String busName);

	List<Bus> getBusesBybusSource(String busSource);

	List<Bus> getBusesBybusType(String busType);
}
