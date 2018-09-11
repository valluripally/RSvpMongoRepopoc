package com.stackroute.juggler.rsvp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.juggler.rsvp.domain.EventDetails;
import com.stackroute.juggler.rsvp.repository.EventRepository;
@Service
public class EventDetailsServiceImpl implements EventDetailsService {

	EventRepository eventRepository;
	@Autowired
	public EventDetailsServiceImpl(EventRepository eventRepository) {
		this.eventRepository=eventRepository;
	}
	
	@Override
	public EventDetails saveEvent(EventDetails eventDetails) {
		EventDetails savedEvent=eventRepository.save(eventDetails);
		return  savedEvent;
	}

	@Override
	public EventDetails getEvent(String emailId) {
		
		return null;
	}

}
