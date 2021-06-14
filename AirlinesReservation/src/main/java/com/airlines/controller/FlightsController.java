package com.airlines.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.airlines.entities.Flight;
import com.airlines.entities.User;
import com.airlines.exception.FlightNotFoundException;
import com.airlines.exception.UserNotFoundException;
import com.airlines.model.FlightResponse;
import com.airlines.model.UserModel;
import com.airlines.services.FlightService;

@RestController
@RequestMapping("/flightsBook")
public class FlightsController {
	
	

	private FlightService flightService;

	public FlightsController(FlightService flightService) {
		super();
		this.flightService = flightService;
	}

	@GetMapping("/searchToBook") 
	public ResponseEntity<Flight> searchToBookFlight(@RequestBody Flight flight) {
		try {
			flightService.getAvailableFlights(flight);
		//flightService.getAvailableFlights(flight);
		return new ResponseEntity<Flight>(HttpStatus.ACCEPTED);
		}
		catch(FlightNotFoundException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
	
	@PostMapping("/getFare") 
	public ResponseEntity<Flight> getFareToBook(@PathVariable("userName") String userName,@RequestParam String classType,@PathVariable("id") int flightId,@RequestParam int noOfSeats) {
		try {
		flightService.gettotalFare(flightId, classType,noOfSeats, userName);
		return new ResponseEntity<Flight>(HttpStatus.OK);
		}
		catch(FlightNotFoundException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		
		
		
	
	}
	
	
	
}
