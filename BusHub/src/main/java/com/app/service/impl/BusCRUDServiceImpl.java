package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.exception.EmptyInputException;
import com.app.model.Bus;
import com.app.repository.BusRepository;
import com.app.service.BusCRUDService;

@Service
public class BusCRUDServiceImpl implements BusCRUDService {

	@Autowired
	private BusRepository repository;

	@Override
	public Bus addBus(Bus bus) {
		// TODO Auto-generated method stub
		if(bus.getBusName().length()== 0 || bus.getBusPrice() == 0 || bus.getBusSource().length() == 0
				|| bus.getBusDestination().length() == 0 || bus.getBusStatus().length() == 0 || bus.getBusType().length() == 0) {
			throw new EmptyInputException("Please enter something");
		}
		
		return repository.save(bus);
	}

	@Override
	public Bus updateBus(Bus bus) {
		// TODO Auto-generated method stub
		if(bus.getBusName().length()== 0 || bus.getBusPrice() == 0 || bus.getBusSource().length() == 0
				|| bus.getBusDestination().length() == 0 || bus.getBusStatus().length() == 0 || bus.getBusType().length() == 0) {
			throw new EmptyInputException("Please enter something");
		}
		return repository.save(bus);

	}

	@Override
	public Bus getBusById(int busId) {
		// TODO Auto-generated method stub
		return repository.findById(busId).get();
	}

	@Override
	public void deleteBus(int busId) {
		// TODO Auto-generated method stub
		repository.deleteById(busId);
	}

}
