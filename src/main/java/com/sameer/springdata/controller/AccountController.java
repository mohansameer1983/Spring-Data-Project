package com.sameer.springdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sameer.springdata.model.Account;
import com.sameer.springdata.model.Payment;
import com.sameer.springdata.repository.PaymentRepository;

@RestController
public class AccountController {

	@Autowired
	PaymentRepository paymentRepository;

	@GetMapping(path="accountById")
	public ResponseEntity<Account> getAccountById(String accountId) {
		try {
			Account account = new Account();
			account.setAccountId(222);
			account.setAccountName("Uber");
			account.setAccountOpenDate("23-09-2020");
			
			account.setAccountId(333);
			account.setAccountName("Amazon");
			account.setAccountOpenDate("22-02-2018");			
		
			if (account==null) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(account, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
