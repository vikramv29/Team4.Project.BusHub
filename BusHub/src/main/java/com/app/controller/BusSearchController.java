package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Bus;
import com.app.service.BusSearchService;

@RestController
public class BusSearchController {
	
	@Autowired
	private BusSearchService service;
	
	@GetMapping("/buses")
	public List<Bus> getAllBuses(){
		return service.getAllBuses();
	}
	
	@GetMapping("/buses/busName/{busName}")
	public List<Bus> getBusesByName(@PathVariable String busName){
		return service.getBusesByName(busName);
	}
	
	@GetMapping("/buses/busSource/{busSource}")
	public List<Bus> getBusesBySource(@PathVariable String busSource){
		return service.getBusesBySource(busSource);
	}
	
	@GetMapping("/buses/busType/{busType}")
	public List<Bus> getBusesByType(@PathVariable String busType){
		return service.getBusesByType(busType);
	}
}
