package com.airlines.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Admin {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adminId;
	private String emailId;
	private String password;
	
	@OneToMany(cascade = { CascadeType.PERSIST }, mappedBy = "user")
	private List<Flight> flights=new ArrayList<>();
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin(int adminId, String emailId, String password) {
		super();
		this.adminId = adminId;
		this.emailId = emailId;
		this.password = password;
	}
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	
	public void addFlight(Flight flight) {
		this.flights.add(flight);
	}
	public List<Flight> getFlights() {
		return flights;
	}
	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}
	
}
