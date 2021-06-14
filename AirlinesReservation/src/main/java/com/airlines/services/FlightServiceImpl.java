package com.airlines.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.airlines.entities.Flight;
import com.airlines.entities.User;
import com.airlines.exception.AirlinesException;
import com.airlines.exception.FlightNotFoundException;
import com.airlines.exception.NoAccessException;
import com.airlines.exception.UserNotFoundException;
import com.airlines.model.AuthResponse;
import com.airlines.model.FlightResponse;
import com.airlines.model.UserLoginModel;
import com.airlines.repositories.FlightRepository;
import com.airlines.repositories.UserRepository;

@Service
public class FlightServiceImpl implements FlightService {

	private UserRepository userRepository;
	private FlightRepository flightRepository;

	public FlightServiceImpl(UserRepository userRepository, FlightRepository flightRepository) {
		super();
		this.userRepository = userRepository;
		this.flightRepository = flightRepository;
	}
	/*
	 * @Override public Flight addFlight(Flight flight, String userRole) throws
	 * NoAccessException {
	 * 
	 * User user = userRepository.findByUserRole(userRole); if
	 * (userRole.equalsIgnoreCase("admin")) {
	 * 
	 * user.addFlight(flight); flight.setUser(user);
	 * 
	 * return flightRepository.save(flight); } else { throw new
	 * NoAccessException("You are not having access to perform this operation"); } }
	 * 
	 * @Override public String deleteFlight(int flightId, String userRole) throws
	 * AirlinesException, NoAccessException { User user =
	 * userRepository.findByUserRole(userRole);
	 * 
	 * if (userRole.equalsIgnoreCase("admin")) { List<Flight> flights =
	 * user.getFlights(); Flight flightEntity = flights.stream().filter(flight ->
	 * flight.getFlightId() == flightId).findFirst().get();
	 * 
	 * flightRepository.delete(flightEntity); return "flight deleted successfully";
	 * } else { throw new
	 * NoAccessException("You are not having access to perform this operation"); }
	 * 
	 * }
	 * 
	 * @Override public Flight searchFlight(Flight flight) throws AirlinesException
	 * {
	 * 
	 * Optional<Flight> findById = flightRepository.findById(flight.getFlightId());
	 * 
	 * if (findById.isPresent()) { return findById.get(); } else { throw new
	 * AirlinesException("Flight with number: " + flight.getFlightId() +
	 * " not present"); } }
	 * 
	 * @Override public Iterable<Flight> getAllFlight() { return
	 * flightRepository.findAll(); }
	 */

	@Override
	public FlightResponse getAvailableFlights(Flight flight) throws FlightNotFoundException {

		FlightResponse flightResponse = null;
		List<Flight> availflights = flightRepository
				.findByFromLocationAndToLocationAndDateOfTravelAndNoOfSeatsAndClassType(flight.getFromLocation(),
						flight.getToLocation(), flight.getDateOfTravel(), flight.getNoOfSeats(), flight.getClassType());

		List<Flight> requiredFlight = new ArrayList<>();
		for (Flight f : availflights) {
			int seats = 0;
			if (flight.getClassType().equalsIgnoreCase("Economy")) {

				seats = f.getEconomySeats();

			}
			if (flight.getClassType().equalsIgnoreCase("Business")) {

				seats = f.getBusinessSeats();
			}

			if (flight.getNoOfSeats() < seats) {
				requiredFlight.add(f);
			}
		}
		return flightResponse;
	}

	public double gettotalFare(int flightId, String classType, int noOfSeats, String userName) throws FlightNotFoundException {

		double totalFare = 0.0;

		User user = userRepository.findByUserName(userName);
		Flight flight = flightRepository.findByFlightId(flightId);

		if (getAvailableFlights(flight) != null) {

			if (classType.equalsIgnoreCase("economy")) {

				totalFare = (flight.getEconomyClassFare() * noOfSeats);
			} else if (classType.equalsIgnoreCase("business")) {
				totalFare = (flight.getBusinessClassFare() * noOfSeats);
			}
			return totalFare;
			
		}
		else {
				throw new FlightNotFoundException("Select valid Flight to get fair");
			}
		
	}
}
