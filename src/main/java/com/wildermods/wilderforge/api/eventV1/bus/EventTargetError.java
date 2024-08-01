package com.wildermods.wilderforge.api.eventV1.bus;

@SuppressWarnings("serial")
public class EventTargetError extends Error {
	
	public EventTargetError(String message) {
		super(message);
	}
	
	public EventTargetError(String message, Throwable cause) {
		super(message, cause);
	}
	
	public EventTargetError(Throwable cause) {
		super(cause);
	}
	
}
