package com.airlines.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airlines.entities.Passenger;
import com.airlines.services.PassengerService;

@RestController
@RequestMapping("/passengerDetails")
public class PassengerController {
	
	private PassengerService passengerService;

	public PassengerController(PassengerService passengerService) {
		super();
		this.passengerService = passengerService;
	}
	
	
	
	@PostMapping("/save")
	public ResponseEntity<Passenger> savePassenger(@RequestBody Passenger passenger) {
		
		passengerService.addPassengers(passenger);
		return new ResponseEntity<Passenger> (passenger,HttpStatus.OK);
		
	}

}
