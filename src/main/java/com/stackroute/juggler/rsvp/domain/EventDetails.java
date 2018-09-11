package com.stackroute.juggler.rsvp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class EventDetails {
@Id
private String id;	
private String creatorOfEvent;
private String eventName;
private String eventType;
private String guestsofEvent[];
private String eventDate;
private String eventTime;
private String duration;
private String eventSynopsis;
private String emailId;
private String invitiesMail[];
private double phoneNo;
public String getCreatorOfEvent() {
	return creatorOfEvent;
}

public void setCreatorOfEvent(String creatorOfEvent) {
	this.creatorOfEvent = creatorOfEvent;
}

public String getEventName() {
	return eventName;
}

public void setEventName(String eventName) {
	this.eventName = eventName;
}

public String getEventType() {
	return eventType;
}

public void setEventType(String eventType) {
	this.eventType = eventType;
}

public String[] getGuestsofEvent() {
	return guestsofEvent;
}

public void setGuestsofEvent(String[] guestsofEvent) {
	this.guestsofEvent = guestsofEvent;
}

public String getEventDate() {
	return eventDate;
}

public void setEventDate(String eventDate) {
	this.eventDate = eventDate;
}

public String getEventTime() {
	return eventTime;
}

public void setEventTime(String eventTime) {
	this.eventTime = eventTime;
}

public String getDuration() {
	return duration;
}

public void setDuration(String duration) {
	this.duration = duration;
}

public String getEventSynopsis() {
	return eventSynopsis;
}

public void setEventSynopsis(String eventSynopsis) {
	this.eventSynopsis = eventSynopsis;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String[] getInvitiesMail() {
	return invitiesMail;
}

public void setInvitiesMail(String[] invitiesMail) {
	this.invitiesMail = invitiesMail;
}

public double getPhoneNo() {
	return phoneNo;
}

public void setPhoneNo(double phoneNo) {
	this.phoneNo = phoneNo;
}
		
public EventDetails(String creatorOfEvent, String eventName, String eventType, String[] guestsofEvent, String eventDate,
		String eventTime, String duration, String eventSynopsis, String emailId, String[] invitiesMail,
		double phoneNo) {
	super();
	this.creatorOfEvent = creatorOfEvent;
	this.eventName = eventName;
	this.eventType = eventType;
	this.guestsofEvent = guestsofEvent;
	this.eventDate = eventDate;
	this.eventTime = eventTime;
	this.duration = duration;
	this.eventSynopsis = eventSynopsis;
	this.emailId = emailId;
	this.invitiesMail = invitiesMail;
	this.phoneNo = phoneNo;
}

}
