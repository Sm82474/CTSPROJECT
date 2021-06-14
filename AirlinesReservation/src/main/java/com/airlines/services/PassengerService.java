package com.airlines.services;

import java.util.List;

import com.airlines.entities.Passenger;

public interface PassengerService {

	public Passenger addPassengers(Passenger passenger);
	public List<Passenger> getAllPassengers(Passenger passenger);
}
