package com.infotech.book.ticket.app.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.book.ticket.app.dao.TicketBookingDao;
import com.infotech.book.ticket.app.entities.Ticket;

/*
 * this is the service class
 * it is used to give service to the client
 * i.e. this class fetches all the information given by the client request
 * and it saves all the information into the database for further usage of the client
 * this class does the above operation by the help of dao class which implements CrudRepository interface
 */
@Service
public class TicketBookingService {

	@Autowired
	TicketBookingDao ticketBookingDao;

	public Ticket createTicket(Ticket ticket) {
		return ticketBookingDao.save(ticket);
	}

	public Ticket getTicktById(Integer ticketId) {
		return ticketBookingDao.findOne(ticketId);
	}

	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingDao.findAll();
	}

	public void deleteTicket(Integer ticketId) {
		ticketBookingDao.delete(ticketId);;
	}

	public Ticket updateTicket(Integer ticketId, String newEmail) {
		Ticket ticketFromDb = ticketBookingDao.findOne(ticketId);
		ticketFromDb.setEmail(newEmail);
		Ticket updatedTicket = ticketBookingDao.save(ticketFromDb);
		return updatedTicket;
	}
	
//	public Ticket updateTicket(Integer ticketId) {
//		Ticket ticketFromDb = ticketBookingDao.findOne(ticketId);
//		ticketFromDb.setBookingDate(new Date());
//		ticketFromDb.setDestStation(new String());
//		ticketFromDb.setSourceStation(new String());
//		ticketFromDb.setPassengerName(new String());
//		ticketFromDb.setEmail(new String());
//		Ticket updatedTicket = ticketBookingDao.save(ticketFromDb);
//		return updatedTicket;
//	}

}
