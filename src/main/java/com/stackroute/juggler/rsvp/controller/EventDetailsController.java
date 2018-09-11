package com.stackroute.juggler.rsvp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.juggler.rsvp.domain.EventDetails;
import com.stackroute.juggler.rsvp.service.EventDetailsService;

@RestController
@RequestMapping("api/v1")
public class EventDetailsController {

	private EventDetailsService eventDetailsService;
	
	@Autowired
	public EventDetailsController(EventDetailsService eventDetailsService){
	this.eventDetailsService =eventDetailsService;
	}	
	
	@RequestMapping(value = "/event", method = RequestMethod.POST)
	public ResponseEntity<?> saveMovie(@RequestBody EventDetails  eventDetails) {
	 
		EventDetails savedEvent = eventDetailsService.saveEvent(eventDetails);
		return new ResponseEntity<EventDetails>(savedEvent, HttpStatus.OK);
	}
	
}
