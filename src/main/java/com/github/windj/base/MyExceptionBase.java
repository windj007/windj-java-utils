package com.github.windj.base;

public class MyExceptionBase extends Exception {

	private static final long	serialVersionUID	= -2977155884286117430L;

	public MyExceptionBase() {
		super();
	}

	public MyExceptionBase(String message, Throwable cause,
		boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MyExceptionBase(String message, Throwable cause) {
		super(message, cause);
	}

	public MyExceptionBase(String message) {
		super(message);
	}

	public MyExceptionBase(Throwable cause) {
		super(cause);
	}
}
