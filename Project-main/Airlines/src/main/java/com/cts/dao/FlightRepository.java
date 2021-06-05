package com.cts.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cts.model.Flights;

public class FlightRepository{

	/*
	 * search flights
	 * getFlights
	 */
	
	@Autowired
	private SessionFactory factory;
	
	public List<Flights> searchFlights(String source,String destination,Date dateOfJourney) {
		
	}
	
	public Flights getFlight(int flightId) {
		
	}
	
	public boolean updateRemainingSeats(Flights flights) {
		Session session = factory.getCurrentSession();
		try
		{
		session.update(flights);
		return true;
		}
		catch(RuntimeException e)
		{
			return false;
		}
	}
	
}
