package com.jpj.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("SERVICE-ORDER")
public interface OrderApi {
 
	@RequestMapping(value = "/order" , method = RequestMethod.POST)
	String returnOrder();
}
