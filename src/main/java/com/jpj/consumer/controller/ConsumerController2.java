package com.jpj.consumer.controller;

import com.jpj.consumer.service.OrderApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController2 {

	@Autowired
	private OrderApi orderApi;

	@RequestMapping(value = "/ribbon/consumer2")
	public String helloConsumer() {
		String string = "1";
		return orderApi.returnOrder();
	}
}
