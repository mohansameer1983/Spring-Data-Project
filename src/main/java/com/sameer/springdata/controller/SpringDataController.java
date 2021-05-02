package com.sameer.springdata.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringDataController {

	@GetMapping(path="paymentDataById")
	public String getPaymentDataById(String paymentId) {
		
		
		return "sameer";
	}
	
}
