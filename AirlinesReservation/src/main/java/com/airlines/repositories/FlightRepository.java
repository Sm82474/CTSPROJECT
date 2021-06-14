package com.airlines.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airlines.entities.Flight;
import com.airlines.entities.User;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {
	//User findByUserNameAndPassword(String userName,String password);//select u from User u where u.userName=1? and password=2?;
	List<Flight> findByFromLocationAndToLocationAndDateOfTravelAndNoOfSeatsAndClassType(String fromLocation,String toLocation,Date dateOfTravel,int noOfSeats,String classType);
	Flight findByFlightId(int flightId);

}

