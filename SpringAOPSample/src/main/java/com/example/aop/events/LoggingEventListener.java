package com.example.aop.events;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class LoggingEventListener {

	/* Defining the handler to be called only in success scenarios */
	@EventListener(condition = "#event.success")
	public void onApplicationEvent(LoggingEvent event) {
		System.out.println("Received Logging Event - " + event.getMessage());
	}
}