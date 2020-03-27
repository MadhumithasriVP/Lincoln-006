package com.service;
import org.springframework.stereotype.Service;
import com.model.Ticket;;
@Service
public class TicketService {
	
	
	public double calculateTotalCost(Ticket ticket)
	{
		double rs=0,s;
   if(ticket.getCircleType().equals("Queen"))
   s=250;
   else
   s=150;
   rs=s*ticket.getNoOfTickets();
  return rs;
		
	}

}
