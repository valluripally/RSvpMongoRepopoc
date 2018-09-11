package com.stackroute.juggler.rsvp.service;

import com.stackroute.juggler.rsvp.domain.EventDetails;

public interface EventDetailsService {
	
	public EventDetails saveEvent(EventDetails eventDetails);
	
	public EventDetails getEvent(String emailId);

}
