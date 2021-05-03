package com.sameer.springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sameer.springdata.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

	Payment findByPaymentId(String PaymentId);
}
