package com.github.windj.utils.factories.exceptions;

import com.github.windj.base.MyExceptionBase;

public class FactoryException extends MyExceptionBase {

	private static final long	serialVersionUID	= 2160628825241280969L;

	public FactoryException() {
		super();
	}

	public FactoryException(String message, Throwable cause,
		boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FactoryException(String message, Throwable cause) {
		super(message, cause);
	}

	public FactoryException(String message) {
		super(message);
	}

	public FactoryException(Throwable cause) {
		super(cause);
	}
}
