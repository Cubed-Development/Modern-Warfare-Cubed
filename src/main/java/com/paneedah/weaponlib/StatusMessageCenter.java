package com.paneedah.weaponlib;

import java.util.Deque;
import java.util.LinkedList;

public final class StatusMessageCenter {
	
	public static class Message {
		long expiresAt;
		String message;
		boolean isAlert;
		
		public Message(String message, long expiresAt) {
			this(message, expiresAt, false);
		}
		
		public Message(String message, long expiresAt, boolean isAlert) {
			this.message = message;
			this.expiresAt = expiresAt;
			this.isAlert = isAlert;
		}

		public String getMessage() {
			return message;
		}

		public boolean isAlert() {
			return isAlert;
		}
	}
	
	protected Deque<Message> messageQueue = new LinkedList<>();

	public void addMessage(String message) {
		addMessage(message, -1);
	}
	/*
	 * Rules:
	 * 	Latest added message has highest display priority
	 * 
	 * To add message:
	 * 	check existing messages in the stack and remove all of them with the same or smaller expiration time
	 */
	public void addMessage(String message, long duration) {
		long expiresAt = duration < 0 ? Long.MAX_VALUE : System.currentTimeMillis() + duration;
		while(!messageQueue.isEmpty()) {
			Message m = messageQueue.removeFirst();
			if(m.expiresAt > expiresAt) {
				// if found a message expiring after the one to add, put it back to the queue and stop the lookup
				messageQueue.addFirst(m);
				break;
			}
		}
		messageQueue.addFirst(new Message(message, expiresAt));
	}
	
	public void addAlertMessage(String message, int count, long duration, long pause) {
		long expiresAt = System.currentTimeMillis();
		messageQueue.clear();
		for(int i = 0; i < count; i++) {
			expiresAt += duration;
			messageQueue.addLast(new Message(message, expiresAt, true));
			expiresAt += pause;
			messageQueue.addLast(new Message("", expiresAt));
		}
	}
	
	public Message nextMessage() {
		Message result = null;
		while(!messageQueue.isEmpty()) {
			Message m = messageQueue.removeFirst();
			if(m.expiresAt > System.currentTimeMillis()) {
				result = m;
				messageQueue.addFirst(m);
				break;
			}
		}
		return result;
	}
	
}
