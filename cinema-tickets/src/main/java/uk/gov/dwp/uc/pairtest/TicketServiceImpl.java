package uk.gov.dwp.uc.pairtest;

import uk.gov.dwp.uc.pairtest.domain.TicketTypeRequest;
import uk.gov.dwp.uc.pairtest.exception.InvalidPurchaseException;


public class TicketServiceImpl implements TicketService {

    /**
     * Should only have private methods other than the one below.
     */
    @Override
    public void purchaseTickets(Long accountId, TicketTypeRequest... ticketTypeRequests) throws InvalidPurchaseException {
      
    	/*Ticket prices */
    	double infantTicketPrice = 0d ;
    	double childTicketPrice = 10d ;
    	double adultTicketPrice = 20d ;
    	
    	/*Selected ticket types and numbers */
    	TicketTypeRequest childTicket = new TicketTypeRequest(TicketTypeRequest.Type.CHILD, 1 );
    	TicketTypeRequest adultTicket = new TicketTypeRequest(TicketTypeRequest.Type.ADULT, 1 );
    	TicketTypeRequest infantTicket = new TicketTypeRequest(TicketTypeRequest.Type.INFANT, 1 );
        
    	/* create Array limit size to 20, add selected tickets to Array */
    	TicketTypeRequest[] ticketsArray = new TicketTypeRequest [20];
		ticketsArray[0] = childTicket ;
		ticketsArray[1] = adultTicket ;
		ticketsArray[2] = infantTicket ;
    	
    	/* Check if selection contains ADULT ticket*/
		for(TicketTypeRequest ticket : ticketsArray) {
    		
    		if(ticket.getTicketType() == TicketTypeRequest.Type.ADULT) {
    			
    			System.out.println("Adult ticket");   
    			
    			if(accountId < 0) {
    				
    				
    				
    			}
    			
    		}else{
    			System.out.println("Must include an Adult ticket");
    		}
    		
    	}
    
    }
}
