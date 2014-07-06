package com.github.windj.utils.factories;

public class CannotCreateFactory extends Exception {

	private static final long	serialVersionUID	= -5421188584047700063L;

	public CannotCreateFactory() {
		super();
	}

	public CannotCreateFactory(String message, Throwable cause,
		boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CannotCreateFactory(String message, Throwable cause) {
		super(message, cause);
	}

	public CannotCreateFactory(String message) {
		super(message);
	}

	public CannotCreateFactory(Throwable cause) {
		super(cause);
	}
}
