package com.airlines.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.airlines.entities.Passenger;
import com.airlines.repositories.PassengerRepository;

@Service
public class PassengerServiceImpl implements PassengerService{

	private PassengerRepository passengerRepository;
	
	public PassengerServiceImpl(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}

	@Override
	public Passenger addPassengers(Passenger passenger) {

		return passengerRepository.save(passenger);
		
		
	}

	@Override
	public List<Passenger> getAllPassengers(Passenger passenger) {

		
		return passengerRepository.findAll();
	}
	

}
