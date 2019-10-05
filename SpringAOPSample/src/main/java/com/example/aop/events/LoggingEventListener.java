package com.example.aop.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class LoggingEventListener implements ApplicationListener<LoggingEvent> {
	@Override
	public void onApplicationEvent(LoggingEvent event) {
		System.out.println("Received Logging Event - " + event.getMessage());
	}
}