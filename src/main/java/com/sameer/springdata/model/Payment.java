package com.sameer.springdata.model;

public class Payment {

	String PaymentId, PaymentAmt, Currency;

	public String getPaymentId() {
		return PaymentId;
	}

	public void setPaymentId(String paymentId) {
		PaymentId = paymentId;
	}

	public String getPaymentAmt() {
		return PaymentAmt;
	}

	public void setPaymentAmt(String paymentAmt) {
		PaymentAmt = paymentAmt;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}
	
	
}
