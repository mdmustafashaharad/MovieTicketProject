package jspiders;

public interface Ticket {
	void ticketBook(int ticket);
	void ticketCancel(int ticket);
	int checkTicket();
	String errorMessage();
}
