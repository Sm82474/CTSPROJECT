package com.airlines.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.airlines.entities.BookingInfo;
import com.airlines.exception.RecordAlreadyPresentException;
import com.airlines.exception.RecordNotFoundException;
import com.airlines.services.BookingService;


@RestController
@RequestMapping("/bookinginfo")
public class BookingController {

	@Autowired
	BookingService bookingService;

	public BookingController(BookingService bookingService) {
		super();
		this.bookingService = bookingService;
	}

	@PostMapping("/createBooking")
	public ResponseEntity<BookingInfo> addBooking(@RequestBody BookingInfo bookingInfo) {
		try {
			return new ResponseEntity<BookingInfo>(bookingService.createBooking(bookingInfo), HttpStatus.OK);

		} catch (RecordAlreadyPresentException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}

	}

/*	@PutMapping("/updateBooking")
	public ResponseEntity<BookingInfo> modifyBooking(@PathVariable BookingInfo bookingInfo) {
		try {
			return new ResponseEntity<BookingInfo>(bookingService.updateBooking(bookingInfo), HttpStatus.OK);
		} catch (RecordNotFoundException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
*/
	@DeleteMapping("/deleteBooking/{id}")
	public ResponseEntity<BookingInfo> deleteBooking(@PathVariable("id") int bookingId) {
		try {
			bookingService.deleteBooking(bookingId);
			return new ResponseEntity<BookingInfo>(HttpStatus.OK);
		} catch (RecordNotFoundException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}

	}
	
	@GetMapping("searchBooking/{id}")
	public ResponseEntity<BookingInfo> searchBooking(@PathVariable("id") int id){
		try {
			bookingService.findBookingInfoById(id);
			return new ResponseEntity<BookingInfo>(HttpStatus.OK);
		} catch (RecordNotFoundException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/allBookings")
	public ResponseEntity<List<BookingInfo>> allBookings(BookingInfo bookingInfo){
		bookingService.displayAllBookings();
		return new ResponseEntity<>(HttpStatus.OK);
		
	}

}