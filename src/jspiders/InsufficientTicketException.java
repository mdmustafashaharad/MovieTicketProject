package jspiders;

public class InsufficientTicketException extends RuntimeException {
	private String message;
	
    InsufficientTicketException(String mesaage) {
		this.message = message;
	}
	@Override
	public String getMessage() {
		return message;
	}
}