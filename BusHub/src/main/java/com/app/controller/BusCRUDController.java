package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Bus;
import com.app.service.BusCRUDService;

@RestController
public class BusCRUDController {

	@Autowired
	private BusCRUDService service;

	@PostMapping("/bus")
	public Bus addBus(@RequestBody Bus bus) {
		return service.addBus(bus);
	}

	@GetMapping("/bus/busId/{busId}")
	public Bus getBusById(@PathVariable int busId) {
		return service.getBusById(busId);
	}

	@DeleteMapping("/bus/busId/{busId}")
	public void deleteBus(@PathVariable int busId) {
		service.deleteBus(busId);
	}

	@PutMapping("/bus")
	public Bus updateBus(@RequestBody Bus bus) {
		return service.updateBus(bus);
	}
}
