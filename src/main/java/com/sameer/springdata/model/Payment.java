package com.sameer.springdata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payments")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PaymentId")
	private String paymentId;
	
	@Column(name = "Currency")
	private String Currency;
	
	@Column(name = "PaymentAmt")
	private double PaymentAmt;
	
	@Column(name = "AccountId")
	private int AccountId;	

	public int getAccountId() {
		return AccountId;
	}

	public void setAccountId(int accountId) {
		AccountId = accountId;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public double getPaymentAmt() {
		return PaymentAmt;
	}

	public void setPaymentAmt(double paymentAmt) {
		PaymentAmt = paymentAmt;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}
}
