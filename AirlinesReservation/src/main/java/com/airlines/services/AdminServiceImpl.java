package com.airlines.services;

import java.util.List;
import java.util.Optional;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.airlines.entities.Admin;
import com.airlines.entities.Flight;
import com.airlines.entities.User;
import com.airlines.exception.AirlinesException;
import com.airlines.exception.NoAccessException;
import com.airlines.exception.UserNotFoundException;
import com.airlines.model.AdminLogin;
import com.airlines.model.AdminResponse;
import com.airlines.model.AuthResponse;
import com.airlines.model.UserLoginModel;
import com.airlines.repositories.AdminRepository;
import com.airlines.repositories.FlightRepository;


@Service
public class AdminServiceImpl implements AdminService {

	private AdminRepository adminRepository;

	private FlightRepository flightRepository;

	public AdminServiceImpl(AdminRepository adminRepository, FlightRepository flightRepository) {
		super();
		this.adminRepository = adminRepository;
		this.flightRepository = flightRepository;
	}
	/*
	//	Seller s = sellerRepository.findByEmailIdAndPassword(seller.getEmailId(), seller.getPassword());
	if (s != null) {
		return new SellerResponse(s.getSellerId(), s.getCompanyName(), s.getCsEmailId(), s.getCsPhoneNumber(),
				s.getAddress(), s.getProducts());
	} else {
		throw new UserNotFoundException("Seller Not Found");
	}
	*/
	/*
	 * 	@Override
	public SellerResponse register(Seller seller) throws ExistingUserException {
		try {
			sellerRepository.save(seller);
			return new SellerResponse(seller.getSellerId(), seller.getCompanyName(), seller.getCsEmailId(),
					seller.getCsPhoneNumber(), seller.getAddress(), seller.getProducts());

		} catch (DataIntegrityViolationException e) {
			throw new ExistingUserException("Seller Already Existing");
		}
User user1= new User();
		user1.setUserName(userModel.getUserName());
		user1.setPhoneNumber(userModel.getPhoneNumber());
		user1.setDateOfBirth(userModel.getDateOfBirth());
		user1.setEmailId(userModel.getEmailId());
		user1.setFirstName(userModel.getFirstName());
		user1.setLastName(userModel.getLastName());
		user1.setPassword(userModel.getPassword());
		
		return 	userRepository.save(user1);
	}
	public AuthResponse validate(UserLoginModel user) throws UserNotFoundException {

		AuthResponse authResponse= null;
		User user1= userRepository.findByEmailIdAndPassword(user.getEmailId(), user.getPassword());
		if(user1!=null) {
			authResponse = new AuthResponse();
			authResponse.setEmailId(user1.getEmailId());
			authResponse.setAuthenticationStatus(true);
			return authResponse;
		}
		else {
			throw new UserNotFoundException("User not found with emailId and password");
		}
	}
	 */
/* Admin register(AdminLogin adm) {
			
		Admin admin=new Admin();
		admin.setEmailId(adm.getEmailId());
		admin.setPassword(adm.getPassword());
		return adminRepository.save(admin);
	}
	*/
	/*
	 * public AuthResponse validate(UserLoginModel user) throws UserNotFoundException {

		AuthResponse authResponse= null;
		User user1= userRepository.findByEmailIdAndPassword(user.getEmailId(), user.getPassword());
		if(user1!=null) {
			authResponse = new AuthResponse();
			authResponse.setEmailId(user1.getEmailId());
			authResponse.setAuthenticationStatus(true);
			return authResponse;
		}
		else {
			throw new UserNotFoundException("User not found with emailId and password");
		}
	 */
		
	

	public AdminResponse validate(AdminLogin admin) throws NoAccessException {

		
		Admin adm = adminRepository.findByAdminIdAndEmailIdAndPassword(admin.getAdminId(),admin.getEmailId(),admin.getPassword());

		AdminResponse adminResponse= null;
		
		if (adm != null) {
			
			adminResponse= new AdminResponse();
			
			adminResponse.setAdminId(adm.getAdminId());
			adminResponse.setEmailId(adm.getEmailId());
			adminResponse.setStatus(true);
			return adminResponse;
			
			
		} else {
			throw new NoAccessException("Admin Not found / No access for this operation");
		}
	}

	

	@Override
	public Flight addFlight(Flight flight, int adminId) throws NoAccessException {

		Admin admin = adminRepository.findByAdminId(adminId);
		
		if(admin!=null) {
			admin.addFlight(flight);
			flight.setAdmin(admin);

			return flightRepository.save(flight);
		} else {
			throw new NoAccessException("Admin Not Found/ You are not having access to perform this operation");
		}
	}

	@Override
	public String deleteFlight(int flightId, int adminId) throws AirlinesException, NoAccessException {
		
		Admin admin = adminRepository.findByAdminId(adminId);

		
			List<Flight> flights = admin.getFlights();
			Flight flightEntity = flights.stream().filter(flight -> flight.getFlightId() == flightId).findFirst().get();

			flightRepository.delete(flightEntity);
			return "flight deleted successfully";
		
	}

	@Override
	public Flight searchFlightById(int flightId,int adminId) throws AirlinesException {

		Admin admin = adminRepository.findByAdminId(adminId);
	
		List<Flight> flights= admin.getFlights();
		
		Optional<Flight> flightEntity = flights.stream().filter(flight -> flight.getFlightId() == flightId).findFirst();

		if (flightEntity.isPresent()) {
			return flightEntity.get();
		} else {
			throw new AirlinesException("Flight with number: " + flightId + " not present");
		}
	}

	@Override
	public Iterable<Flight> getAllFlight() {
		Admin admin= new Admin();
		adminRepository.findByAdminId(admin.getAdminId());
		List<Flight> flights= admin.getFlights();
		return flights;
	}
	
	
}
