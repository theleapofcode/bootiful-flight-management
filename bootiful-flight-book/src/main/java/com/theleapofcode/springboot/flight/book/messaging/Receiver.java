package com.theleapofcode.springboot.flight.book.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.theleapofcode.springboot.flight.book.component.BookingComponent;
import com.theleapofcode.springboot.flight.book.component.BookingStatus;

@Component
public class Receiver {
	
	BookingComponent bookingComponent;
	
	@Autowired
	public Receiver(BookingComponent bookingComponent){
		this.bookingComponent = bookingComponent;
	}
	@RabbitListener(queues = "CheckINQ")
    public void processMessage(long bookingID ) {
		System.out.println(bookingID);
		bookingComponent.updateStatus(BookingStatus.CHECKED_IN, bookingID);
    }
	
}