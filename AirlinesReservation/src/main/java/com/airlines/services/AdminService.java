package com.airlines.services;

import com.airlines.entities.Admin;
import com.airlines.entities.Flight;
import com.airlines.exception.AirlinesException;
import com.airlines.exception.NoAccessException;
import com.airlines.model.AdminLogin;
import com.airlines.model.AdminResponse;

public interface AdminService  {

	
	public AdminResponse validate(AdminLogin admin) throws NoAccessException;
	//public AdminLogin validate(Admin admin) throws NoAccessException;
	public Flight addFlight(Flight flight,int adminId) throws NoAccessException;
	public Flight searchFlightById(int flightId,int adminId) throws AirlinesException;
	public Iterable<Flight> getAllFlight();
	public String deleteFlight(int flightId,int adminId) throws AirlinesException, NoAccessException;
}
