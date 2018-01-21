package ua.Kharkov.Hitman.lesson8.vektor;

@SuppressWarnings("serial")
public class IncorrectIndexException extends RuntimeException {

	public IncorrectIndexException() {
		super();
	}

	public IncorrectIndexException(String message, Throwable cause) {
		super(message, cause);

	}

	public IncorrectIndexException(String message) {
		super(message);
	}

	public IncorrectIndexException(Throwable cause) {
		super(cause);
	}

}
