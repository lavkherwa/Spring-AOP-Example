package com.example.aop.events;

import org.springframework.context.ApplicationEvent;

public class LoggingEvent extends ApplicationEvent {
	private static final long serialVersionUID = -5380845885696803323L;

	private String message;

	public LoggingEvent(Object source, String message) {
		super(source);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}