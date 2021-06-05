package com.cts.model;

import java.util.List;

import javax.persistence.OneToMany;

public class TotalSeats {
	

	private int totalBusinessSeats;
	private int totalEconomySeats;
	
	@OneToMany
	private List<Flights> flights;

	public int getTotalBusinessSeats() {
		return totalBusinessSeats;
	}

	public void setTotalBusinessSeats(int totalBusinessSeats) {
		this.totalBusinessSeats = totalBusinessSeats;
	}

	public int getTotalEconomySeats() {
		return totalEconomySeats;
	}

	public void setTotalEconomySeats(int totalEconomySeats) {
		this.totalEconomySeats = totalEconomySeats;
	}

	

	public List<Flights> getFlights() {
		return flights;
	}

	public void setFlights(List<Flights> flights) {
		this.flights = flights;
	}
}
