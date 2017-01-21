package com.theleapofcode.springboot.flight.checkin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.theleapofcode.springboot.flight.checkin.component.CheckinComponent;
import com.theleapofcode.springboot.flight.checkin.entity.CheckInRecord;

@RestController
@CrossOrigin
@RequestMapping("/checkin")
public class CheckInController {

	CheckinComponent checkInComponent;

	@Autowired
	CheckInController(CheckinComponent checkInComponent) {
		this.checkInComponent = checkInComponent;
	}

	@RequestMapping("/get/{id}")
	CheckInRecord getCheckIn(@PathVariable long id) {
		return checkInComponent.getCheckInRecord(id);
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	long checkIn(@RequestBody CheckInRecord checkIn) {
		return checkInComponent.checkIn(checkIn);
	}

}
