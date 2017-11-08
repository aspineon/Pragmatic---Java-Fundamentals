package edu.bookstore.model.exceptions;

public class BookstoreException extends Exception {

	private static final long serialVersionUID = -6242868852440185976L;

	public BookstoreException() {
		super();
	}

	public BookstoreException(String message) {
		super(message);
	}
}