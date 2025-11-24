package xyz.metalix.soclient.events.impl;

import xyz.metalix.soclient.events.Event;

public class ChatEvent extends Event {
	
	private String message;
	
	public ChatEvent(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

}
