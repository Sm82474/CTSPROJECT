package com.airlines.services;

import java.math.BigInteger;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.airlines.entities.Flight;
import com.airlines.exception.AirlinesException;
import com.airlines.exception.FlightNotFoundException;
import com.airlines.exception.NoAccessException;
import com.airlines.model.FlightResponse;

public interface FlightService  {

	//public Flight addFlight(Flight flight, String userName) throws NoAccessException;
	//public Flight searchFlight(Flight flights) throws AirlinesException;
	//public Iterable<Flight> getAllFlight();
	//public String deleteFlight(int flightId,String userName) throws AirlinesException, NoAccessException;	
	public FlightResponse getAvailableFlights(Flight flights) throws FlightNotFoundException;
	public double gettotalFare(int flightId, String classType, int noOfSeats, String userName) throws FlightNotFoundException;
	
}
