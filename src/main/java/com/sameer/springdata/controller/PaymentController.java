package com.sameer.springdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sameer.springdata.model.Payment;
import com.sameer.springdata.repository.PaymentRepository;

@RestController
public class PaymentController {

	@Autowired
	PaymentRepository paymentRepository;

	@GetMapping(path="paymentDataById")
	public ResponseEntity<Payment> getPaymentDataById(String paymentId) {
		try {
			Payment payment = paymentRepository.findByPaymentId(paymentId);

			if (payment==null) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(payment, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
