package com.infotech.book.ticket.app;


import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.infotech.book.ticket.app.entities.Ticket;
import com.infotech.book.ticket.app.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingManagementAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=SpringApplication.run(TicketBookingManagementAppApplication.class, args);
		TicketBookingService ticketBookingService = applicationContext.getBean("ticketBookingService",TicketBookingService.class);
		
		Ticket ticket=new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setDestStation("mumbai");
		ticket.setSourceStation("pune");
		ticket.setPassengerName("drs");
		ticket.setEmail("drs@rediff.com");
		
		ticketBookingService.createTicket(ticket);
	}
}
