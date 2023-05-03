package com.email.model;

import java.util.Arrays;

public class Email {

	private String[] toMail;
	private String subject;
	private String message;
	public Email(String[] toMail, String subject, String message) {
		super();
		this.toMail = toMail;
		this.subject = subject;
		this.message = message;
	}
	public Email() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String[] getToMail() {
		return toMail;
	}
	public void setToMail(String[] toMail) {
		this.toMail = toMail;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Email [toMail=" + (toMail) + ", subject=" + subject + ", message=" + message + "]";
	}

	
	
	

}
