package com.infotech.book.ticket.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infotech.book.ticket.app.entities.Ticket;
import com.infotech.book.ticket.app.service.TicketBookingService;
/*
 * this is the controller class
 * it is used to control all the request given by the user
 * i.e. it has control on each and every client request sent to it
 * handles all the request sent by the client
 * and sends that to the particular method based on the url
 */
@RestController
@RequestMapping(value = "/api/tickets")
public class TicketBookingController {

	@Autowired
	private TicketBookingService ticketBookingService;

	/*
	 * this method creates ticket according to the user requirement
	 * here the type of the client request is "post"
	 */
	@PostMapping(value = "/create")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketBookingService.createTicket(ticket);
	}

	/*
	 * this method displays the booked ticket according to the "ticketId" given by the client
	 * here the type of the client request is "get"
	 */
	@GetMapping(value = "/ticket/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId") Integer ticketId) {
		return ticketBookingService.getTicktById(ticketId);
	}
	
	/*
	 * this method displays all the booked ticket according to the client request
	 * here the type of the client request is "get"
	 */
	@GetMapping(value = "/ticket/alltickets")
	public Iterable<Ticket> getAllBookedTickets(){
		return ticketBookingService.getAllBookedTickets();
	}
	
	/*
	 * this method is used to update the ticket according to the client request
	 * here the ticket is updated based on the "ticketId" given by the client
	 * here the type of the client request is "put"
	 */
	@PutMapping(value = "/ticket/{ticketId}/{newEmail:.+}")
	public Ticket updateTicket(@PathVariable("ticketId") Integer ticketId,@PathVariable("newEmail")String newEmail) {
		return ticketBookingService.updateTicket(ticketId,newEmail);
	}
	
//	@PutMapping(value = "/ticket/{ticketId}")
//	public Ticket updateTicket(@PathVariable("ticketId") Integer ticketId) {
//		return ticketBookingService.updateTicket(ticketId);
//	}
	
	
	/*
	 * this method is used to delete the ticket according to the client request
	 * here the ticket is deleted based on the "ticketId" given by the client
	 * here the type of the client request is "put"
	 */
	@DeleteMapping(value = "/ticket/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId") Integer ticketId) {
		ticketBookingService.deleteTicket(ticketId);
	}
	
}
