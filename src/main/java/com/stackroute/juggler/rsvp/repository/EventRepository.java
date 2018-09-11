package com.stackroute.juggler.rsvp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.juggler.rsvp.domain.EventDetails;
//This repository is used to perform various operations on database	
@Repository
public interface EventRepository extends MongoRepository < EventDetails, String>{

	public String getByEmailId();
	
}
