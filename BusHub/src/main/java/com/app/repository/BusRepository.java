package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Bus;

@Repository
public interface BusRepository extends JpaRepository<Bus, Integer> {

	List<Bus> findByName(String name) ;
	List<Bus> findBySource(String busSource) ;
	List<Bus> findByDestination(String busDestination) ;
	List<Bus> findByPrice(double busPrice) ;
	List<Bus> findByType(String busType) ;
	
}
