package com.example;

public class InvalidOperationException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3948502214954242195L;

	public InvalidOperationException() {
        super();
    }

    public InvalidOperationException(String message) {
        super(message);
    }

    public InvalidOperationException(Throwable cause) {
        super(cause);
    }

    public InvalidOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}