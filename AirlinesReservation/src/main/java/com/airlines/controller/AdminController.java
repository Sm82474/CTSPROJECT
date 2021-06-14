package com.airlines.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airlines.entities.Admin;
import com.airlines.entities.Flight;
import com.airlines.entities.User;
import com.airlines.exception.AirlinesException;
import com.airlines.exception.NoAccessException;
import com.airlines.exception.UserNotFoundException;
import com.airlines.model.AdminLogin;
import com.airlines.model.AuthResponse;
import com.airlines.model.UserLoginModel;
import com.airlines.model.UserModel;
import com.airlines.services.AdminService;



@RestController
@RequestMapping("/Adminflightspage")
public class AdminController {

	// private FlightService flightService;

	private AdminService adminService;

	public AdminController() {
		// TODO Auto-generated constructor stub
	}

	public AdminController(AdminService adminService) {
		super();
		this.adminService = adminService;
	}

	/*
	 * public AdminController(FlightService flightService) { super();
	 * this.flightService = flightService; }
	 */
	
	
	/*
	 * @PostMapping("/register")
	public ResponseEntity<SellerResponse> registration(@RequestBody Seller seller) throws ExistingUserException{
		return new ResponseEntity<SellerResponse>(sellerService.register(seller), HttpStatus.CREATED);
	}
	@PostMapping("/register")
	public ResponseEntity register(@RequestBody UserModel userModel) throws UserNotFoundException {
		User user1= userService.registerUser(userModel);
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	@PostMapping("/login")
	public ResponseEntity<AuthResponse> login(@RequestBody UserLoginModel user) throws UserNotFoundException {
		AuthResponse authResponse=userService.validate(user);
			return new ResponseEntity<AuthResponse>(authResponse,HttpStatus.OK);
		
	}
	 */
	
	
	@PostMapping("/adminLogin") 
	public ResponseEntity<AdminLogin> login(@RequestBody AdminLogin admin) {
		
		try {
			adminService.validate(admin);
			return new ResponseEntity<AdminLogin>(HttpStatus.ACCEPTED);
		} catch (NoAccessException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		
	}
	
	
	@PostMapping("{adminId}/add")
	public ResponseEntity<Flight> addFlights(@PathVariable("adminId") int adminId, @RequestBody Flight flight)
			throws AirlinesException {
		try {
			Flight newFlight = adminService.addFlight(flight, adminId);
			return new ResponseEntity<Flight>(newFlight, HttpStatus.CREATED);
		} catch (NoAccessException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/allFlight")
	public ResponseEntity<Iterable<Flight>> viewAllFlight() throws AirlinesException {
		adminService.getAllFlight();
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@DeleteMapping("{adminId}/deleteFlight/{id}")
	public ResponseEntity<Flight> deleteFlight(@PathVariable("adminId") int adminId, @PathVariable("id") int flightId)
			throws AirlinesException {
		try {
			adminService.deleteFlight(flightId, adminId);
			// changed adminservice to flightService

			return new ResponseEntity<Flight>(HttpStatus.OK);
		} catch (NoAccessException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
}
