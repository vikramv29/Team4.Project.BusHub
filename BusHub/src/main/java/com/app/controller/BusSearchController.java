package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Bus;
import com.app.service.BusSearchService;

@RestController
@CrossOrigin
public class BusSearchController {
	
	@Autowired
	private BusSearchService service;
	
	@GetMapping("/buses")
	public List<Bus> getAllBuses(){
		return service.getAllBuses();
	}
	
	@GetMapping("/buses/busName/{busName}")
	public List<Bus> getBusesBybusName(@PathVariable String busName){
		return service.getBusesBybusName(busName);
	}
	
	@GetMapping("/buses/busSource/{busSource}")
	public List<Bus> getBusesBybusSource(@PathVariable String busSource){
		return service.getBusesBybusSource(busSource);
	}
	
	@GetMapping("/buses/busType/{busType}")
	public List<Bus> getBusesBybusType(@PathVariable String busType){
		return service.getBusesBybusType(busType);
	}
}
