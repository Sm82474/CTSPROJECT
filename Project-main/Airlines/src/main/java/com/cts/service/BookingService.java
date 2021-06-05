package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.BookingRepository;
import com.cts.dao.FlightRepository;
import com.cts.dao.UserRepository;
import com.cts.model.Booking;
import com.cts.model.ClassType;
import com.cts.model.Flights;
import com.cts.model.User;

@Service
public class BookingService {

	/*
	 * checkFlightAvailability
	 * bookTicket
	 * cancelTicket
	 */
	
	@Autowired
	private BookingRepository bookingRepository;
	
	@Autowired
	private FlightRepository  flightRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public boolean checkFlightAvailability(int flightId,int seatsRequired,String classType ) {
		
		Flights flights=flightRepository.getFlight(flightId);
		if(flights!= null) {
			
			if(classType.equals("Economy")) {
				if(flights.getRemainingEconomySeats()<seatsRequired) {
					return false;
				}
				else {
					return true;
				}
			}
			if(classType.equals("Business")) {
				if(flights.getRemainingEconomySeats()<seatsRequired) {
					return false;
				}
				else {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean bookTicket(Booking booking, List<User> user) {
		
		if(updateSeat(booking.getFlights().getFlightId(),booking.getSeatsBooked(),booking.getClassType())) {
			
			for(User u:user) {
				if(!userRepository.newUser(u)) {
					return false;
				}
			
			}
			if(!bookingRepository.newBooking(booking)) {
				return false;
			}
			return true;
		}
		else
			return false;
	}
	
	private boolean updateSeat(int flightId, int seats, String classType) {
		Flights flights= flightRepository.getFlight(flightId);
		if(flights!=null) {
			if(classType.equals("Economy")) {
				flights.setRemainingEconomySeats(flights.getRemainingEconomySeats() - seats);
			}
				//business class
			if(classType.equals("Business")) {
				flights.setRemainingBusinessSeats(flights.getRemainingBusinessSeats() - seats);
			}
		flightRepository.updateRemainingSeats(flights);
		return true;
	}
	
	
		return false;
	

}


	public boolean cancelTicket(int bookingId) {
		Booking booking= bookingRepository.getBooking(bookingId);
		Flights flights= flightRepository.getFlight(booking.getFlights().getFlightId());
		
		if(bookingRepository.getBooking(bookingId) != null){
			if(flights != null) {
				String classType = booking.getClassType();
				int seats = booking.getSeatsBooked();
				if(classType.equals("Economy"))
					flights.setRemainingEconomySeats(flights.getRemainingEconomySeats() + seats);
				//business class
				if(classType.equals("Business"))
					flights.setRemainingBusinessSeats(flights.getRemainingBusinessSeats() + seats);
		
				flightRepository.updateRemainingSeats(flights);
			}
			bookingRepository.deleteBooking(bookingId);
			return true;
	}
		return false;
	}
}

