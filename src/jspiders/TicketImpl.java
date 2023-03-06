package jspiders;

public class TicketImpl implements Ticket {
	 int tickets;
	 int temp = tickets;
	
	public TicketImpl(int tickets) {
		this.tickets = tickets;
		this.temp = tickets;
	}
	@Override
	public void ticketBook(int ticket) {
		if(tickets == 0) {
			System.out.println("Tickets Are Empty");
//			try {
//				throw new InsufficientTicketException("Tickets are Empty");
//			} catch(InsufficientTicketException e) {
//				System.out.println(e.getMessage());
//			}
		}
		else if( ticket > tickets ) {
			System.out.println("sorry.....Having Less Tickets...");
		} 
		else {
			System.out.println("_______________________________\n");
			System.out.println("Your Booking Tickets are "+ticket);
			tickets-=ticket;
			System.out.println("You successfully Booked");
		}
	}
	@Override
	public void ticketCancel(int ticket) {
		if (temp == tickets) {
			System.out.println("Hello mister...R u genius!!!");
			System.out.println("Till not sold any one ticket how u canceling");
		}
		else if (ticket > (temp -  tickets)) {
			System.out.println("Hello Mister ! mention currect tickets ");
		} else {
			System.out.println("____________________________________\n");
			System.out.println(" Your Cancelling tickets are "+ticket);
			tickets+= ticket;
			System.out.println("Your tickets are cancelled");
		}
	}
	@Override
	public int checkTicket() {
		System.out.println("_______________________________________\n");
		return this.tickets = tickets;
	}
	@Override
	public String errorMessage() {
		System.out.println("_____________________________________\n");
		return "Invalid choice please enter currect choice!";
	}
}
