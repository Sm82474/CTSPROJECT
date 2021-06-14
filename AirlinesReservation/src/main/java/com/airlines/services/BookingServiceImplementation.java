package com.airlines.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airlines.entities.BookingInfo;
import com.airlines.exception.RecordAlreadyPresentException;
import com.airlines.exception.RecordNotFoundException;
import com.airlines.repositories.BookingInfoRepository;



@Service
public class BookingServiceImplementation implements BookingService {

	@Autowired
	BookingInfoRepository bookingInfoRepo;

	public BookingServiceImplementation(BookingInfoRepository bookingInfoRepo) {
		super();
		this.bookingInfoRepo = bookingInfoRepo;
	}

	@Override
	public BookingInfo createBooking(BookingInfo bookingInfo) throws RecordAlreadyPresentException  {
		Optional<BookingInfo> findById = bookingInfoRepo.findById(bookingInfo.getBookingId());
		if (!findById.isPresent()) {
			return bookingInfoRepo.save(bookingInfo);
		} else {
			throw new RecordAlreadyPresentException("Booking Id already exists");
		}

	}

	@Override
	public BookingInfo updateBooking(BookingInfo bookingInfo) throws RecordNotFoundException {
		Optional<BookingInfo> findById = bookingInfoRepo.findById(bookingInfo.getBookingId());
		if (findById.isPresent()) {
			bookingInfoRepo.save(bookingInfo);
		} else {
			throw new RecordNotFoundException("No record with this booking Id");
		}
		return bookingInfo;

	}

	@Override
	public String deleteBooking(int bookingId) throws RecordNotFoundException {
		Optional<BookingInfo> findById = bookingInfoRepo.findById(bookingId);
		if (findById.isPresent()) {
			bookingInfoRepo.deleteById(bookingId);
			return "Booking Deleted";
		} else {
			throw new RecordNotFoundException("No booking for the given Id");
		}

	}

	@Override
	public List<BookingInfo> displayAllBookings() {
		return bookingInfoRepo.findAll();
	}

	@Override
	public BookingInfo findBookingInfoById(int bookingId) throws RecordNotFoundException {
		Optional<BookingInfo> findById = bookingInfoRepo.findById(bookingId);
			if (findById.isPresent()) {
				return findById.get();
			} else {
				throw new RecordNotFoundException("No record found");
			}
		
	}

}