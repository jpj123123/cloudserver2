package com.jpj.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/ribbon/consumer")
	public String helloConsumer() {
		String string = "1";
		ResponseEntity<String> responseEntity = restTemplate.postForEntity("http://SERVICE-ORDER/order", string, String.class);
		return responseEntity.getBody();
	}
}
