package com.airlines.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//import java.sql.Timestamp;
//import java.util.Date;


@Entity
public class BookingInfo {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	private Date bookingDate;
	private LocalTime bookingTime;
	private int noOfPassengers;
	private String bookingStatus;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private User user;
	
	@ManyToOne(cascade = {CascadeType.PERSIST})
	@JoinColumn(name = "flightId")
	private Flight flight;
public BookingInfo() {
	// TODO Auto-generated constructor stub
}
	

	public BookingInfo(int bookingId, Date bookingDate, LocalTime bookingTime, int noOfPassengers, String bookingStatus,
		User user, Flight flight) {
	super();
	this.bookingId = bookingId;
	this.bookingDate = bookingDate;
	this.bookingTime = bookingTime;
	this.noOfPassengers = noOfPassengers;
	this.bookingStatus = bookingStatus;
	this.user = user;
	this.flight = flight;
}


	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public LocalTime getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(LocalTime bookingTime) {
		this.bookingTime = bookingTime;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Flight getFlights() {
		return flight;
	}

	public void setFlights(Flight flights) {
		this.flight = flights;
	}
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	
	}
	
	
	