package com.infotech.book.ticket.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * this is the main class
 * it is used to run the application in the server
 */
@SpringBootApplication
public class TicketBookingManagementAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingManagementAppApplication.class, args);
		
		
//		ConfigurableApplicationContext applicationContext=SpringApplication.run(TicketBookingManagementAppApplication.class, args);
//		TicketBookingService ticketBookingService = applicationContext.getBean("ticketBookingService",TicketBookingService.class);
//		
//		Ticket ticket=new Ticket();
//		ticket.setBookingDate(new Date());
//		ticket.setDestStation("mumbai");
//		ticket.setSourceStation("pune");
//		ticket.setPassengerName("drs");
//		ticket.setEmail("drs@rediff.com");
//		
//		ticketBookingService.createTicket(ticket);
	}
}
