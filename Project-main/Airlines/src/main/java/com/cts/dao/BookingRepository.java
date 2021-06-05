package com.cts.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.model.Booking;
import com.cts.model.User;

@Repository
public class BookingRepository {

	/*
	 * new booking
	 * getBooking details
	 * getBooking
	 */
	
	@Autowired
	private SessionFactory factory;
	
	public boolean newBooking(Booking booking) {
		
		Session session=factory.getCurrentSession();
		session.save(booking);
		return true;
		
	}
	
	public List<Booking> getBookingDetails(int userId) {
		
		Session session=factory.getCurrentSession();
		List<Booking> bookingList;
		session.beginTransaction().commit();
		String sql_query="from Booking WHERE person= "+userId;
		bookingList= session.createQuery(sql_query).list();
		return bookingList;
		
	}
	
	public boolean deleteBooking(int bookingId) {
		Session session = factory.getCurrentSession();
		try
		{
			Booking del = (Booking) session.load(Booking.class, bookingId);
			session.delete(del);
			return true;
		}
		catch(RuntimeException e)
		{
			return false;
		}
}
	
	public Booking getBooking(int bookingId) {
		Booking booking=new Booking();
		Session session = factory.getCurrentSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("flightId", bookingId));
		booking=(Booking)criteria.uniqueResult();
		return booking;
	}
	
}
