package com.example.aop.events;

import org.springframework.context.ApplicationEvent;

public class LoggingEvent extends ApplicationEvent {
	private static final long serialVersionUID = -5380845885696803323L;

	private String message;
	public boolean success;

	public LoggingEvent(Object source, String message, boolean success) {
		super(source);
		this.message = message;
		this.success = success;
	}

	public String getMessage() {
		return message;
	}
}