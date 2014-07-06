package com.github.windj.utils.logging;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogWrapper {
	private Logger	logger;

	public LogWrapper(Logger logger) {
		this.logger = logger;
	}

	public void severe(Throwable ex, String format, Object... args) {
		logException(logger, Level.SEVERE, ex, format, args);
	}

	public void severe(String format, Object... args) {
		log(logger, Level.SEVERE, format, args);
	}

	public void warn(Throwable ex, String format, Object... args) {
		logException(logger, Level.WARNING, ex, format, args);
	}

	public void warn(String format, Object... args) {
		log(logger, Level.WARNING, format, args);
	}

	public void info(Throwable ex, String format, Object... args) {
		logException(logger, Level.INFO, ex, format, args);
	}
	
	public void info(String format, Object... args) {
		log(logger, Level.INFO, format, args);
	}

	public void debug(Throwable ex, String format, Object... args) {
		logException(logger, Level.FINE, ex, format, args);
	}
	
	public void debug(String format, Object... args) {
		log(logger, Level.FINE, format, args);
	}

	public static void log(Logger log, Level level, String format,
		Object... args) {
		log.log(level, String.format(format, args));
	}

	public static void logException(Logger log, Level level, Throwable ex,
		String format, Object... args) {
		log.log(level, String.format(format, args));
		ByteArrayOutputStream ostr = new ByteArrayOutputStream();
		PrintWriter writer = new PrintWriter(ostr);
		ex.printStackTrace(writer);
		writer.close();
		log.log(level, ostr.toString());
	}

}
