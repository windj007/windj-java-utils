package com.github.windj.utils.factories.exceptions;

public class CannotLoadObject extends FactoryException {

	private static final long	serialVersionUID	= -6314039377854272962L;

	public CannotLoadObject() {
		super();
	}

	public CannotLoadObject(String message, Throwable cause,
		boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CannotLoadObject(String message, Throwable cause) {
		super(message, cause);
	}

	public CannotLoadObject(String message) {
		super(message);
	}

	public CannotLoadObject(Throwable cause) {
		super(cause);
	}
}
