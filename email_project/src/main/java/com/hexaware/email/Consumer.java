package com.hexaware.email;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
public class Consumer {

	@JmsListener(destination = "bug_queue")
	public void consumer(Bug message) {
		System.out.println("Consumed Message " + message.getEmail());

	}

}
