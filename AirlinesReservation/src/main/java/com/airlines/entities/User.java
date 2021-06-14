package com.airlines.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String password;
	private String userName;
	private String firstName;
	private String lastName;
	private long phoneNumber;
	//private String userRole;
	private String emailId;
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	private String gender;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="user")	
	private List<BookingInfo> booking= new ArrayList<>();
	
	@OneToMany(cascade = { CascadeType.PERSIST }, mappedBy = "user")
	private List<Flight> flights=new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<Passenger> passenger=new ArrayList<>();
	

	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<BookingInfo> getBooking() {
		return booking;
	}

	public void setBooking(List<BookingInfo> booking) {
		this.booking = booking;
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

	public List<Passenger> getPassenger() {
		return passenger;
	}

	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}

	public User(int userId, String password, String userName, String firstName, String lastName, long phoneNumber,
			 String emailId, Date dateOfBirth, String gender, List<BookingInfo> booking,
			List<Flight> flights, List<Passenger> passenger) {
		super();
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.booking = booking;
		this.flights = flights;
		this.passenger = passenger;
	}
	

	
}
