package com.rhyno.club.exception;

import java.time.LocalDateTime;

public class CustomErrorResponse {
	private LocalDateTime errorOccurTime;
	private String user;
	private String message;

	public CustomErrorResponse(LocalDateTime errorOccurTime, String user, String message) {
		super();
		this.errorOccurTime = errorOccurTime;
		this.user = user;
		this.message = message;
	}

	public LocalDateTime getErrorOccurTime() {
		return errorOccurTime;
	}

	public void setErrorOccurTime(LocalDateTime errorOccurTime) {
		this.errorOccurTime = errorOccurTime;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "CustomErrorResponse [errorOccurTime=" + errorOccurTime + ", user=" + user + ", message=" + message
				+ "]";
	}
	
	

}
