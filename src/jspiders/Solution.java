package jspiders;
import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Ticket t = new TicketImpl(250);
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("  Welcome To Movie Ticket Counter\n_________________________________");
			System.out.println("     ****Choice Any one number**** ");
			System.out.println("        1. Book Tickets\n        2. Cancel Ticket\n"
					+ "        3. Check Available Tickes\n"+ "        4. Exit");
			int choice = scan.nextInt();
			switch ( choice ) {
			case 1 : {
				System.out.println("Enter Tickets ");
				t.ticketBook(scan.nextInt());
				System.out.println("Now Available tickets are "+ t.checkTicket()); 
				break;
			}
			case 2 : {
				System.out.println("Mention Your returning Tickets ");
				t.ticketCancel(scan.nextInt());
				System.out.println("Now Available tickets are "+ t.checkTicket()); 
				break;
			}
			case 3 : {
				System.out.println("Available tickets are "+t.checkTicket());
				break;
			}
			case 4 : {
				System.out.println("Thank you!");
				System.exit(0);
			}
			default : {
				System.out.println(t.errorMessage());
			}
			
			}
			System.out.println("_________________________________\n");
		}
	}
}
