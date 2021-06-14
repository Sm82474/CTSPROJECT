package com.airlines.entities;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Flight {

	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int flightId;
	private String flightName;
	private String fromLocation;
	private String toLocation;
	private LocalTime departureTime; //
	private LocalTime arrivalTime;
	private LocalTime duration;
	private int price;
	private String classType;
	private int economySeats;
	private int businessSeats;
	@Temporal(TemporalType.DATE)
	private Date dateOfTravel;
	private int totalSeats;
	private int noOfSeats;
	private int businessClassFare;
	private int EconomyClassFare;

	@ManyToOne(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "userId")
	private User user;
	
	@ManyToOne(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "adminId")
	private Admin admin;
	
	
	
//	@OneToMany(cascade= {CascadeType.PERSIST})
	//@JoinColumn(name="flightFareId")
//	private FlightFare flightFare;

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Flight() {
		// TODO Auto-generated constructor stub
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public LocalTime getDuration() {
		return duration;
	}

	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public Date getDateOfTravel() {
		return dateOfTravel;
	}

	public void setDateOfTravel(Date dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getEconomySeats() {
		return economySeats;
	}

	public void setEconomySeats(int economySeats) {
		this.economySeats = economySeats;
	}

	public int getBusinessSeats() {
		return businessSeats;
	}

	public void setBusinessSeats(int businessSeats) {
		this.businessSeats = businessSeats;
	}

	public int getBusinessClassFare() {
		return businessClassFare;
	}

	public void setBusinessClassFare(int businessClassFare) {
		this.businessClassFare = businessClassFare;
	}

	public int getEconomyClassFare() {
		return EconomyClassFare;
	}

	public void setEconomyClassFare(int economyClassFare) {
		EconomyClassFare = economyClassFare;
	}

	public Flight(int flightId, String flightName, String fromLocation, String toLocation, LocalTime departureTime,
			LocalTime arrivalTime, LocalTime duration, int price, String classType, int economySeats, int businessSeats,
			Date dateOfTravel, int totalSeats, int noOfSeats, int businessClassFare, int economyClassFare, User user) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.duration = duration;
		this.price = price;
		this.classType = classType;
		this.economySeats = economySeats;
		this.businessSeats = businessSeats;
		this.dateOfTravel = dateOfTravel;
		this.totalSeats = totalSeats;
		this.noOfSeats = noOfSeats;
		this.businessClassFare = businessClassFare;
		EconomyClassFare = economyClassFare;
		this.user = user;
	}

	/*public FlightFare getFlightFare() {
		return flightFare;
	}

	public void setFlightFare(FlightFare flightFare) {
		this.flightFare = flightFare;
	}

	*/
	



	

}
