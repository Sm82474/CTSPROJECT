package com.airlines.services;
import java.util.List;

import com.airlines.entities.BookingInfo;
import com.airlines.exception.RecordAlreadyPresentException;
import com.airlines.exception.RecordNotFoundException;





public interface BookingService {
	
	public BookingInfo createBooking(BookingInfo bookingInfo) throws RecordAlreadyPresentException;
	public BookingInfo updateBooking(BookingInfo bookingInfo) throws RecordNotFoundException;
	public String deleteBooking(int bookingId) throws RecordNotFoundException;
	public List<BookingInfo> displayAllBookings();
	//public void findBookingInfoById(Integer bookingId);
	public BookingInfo findBookingInfoById(int bookingId) throws RecordNotFoundException;

}