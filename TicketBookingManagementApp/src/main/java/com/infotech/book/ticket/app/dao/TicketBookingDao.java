package com.infotech.book.ticket.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infotech.book.ticket.app.entities.Ticket;

/*
 * dao interface extends CrudRepository interface
 * all the functions and implementations for the "crud" operation are existing in the "CrudRepository" interface
 */
@Repository
public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{

}
