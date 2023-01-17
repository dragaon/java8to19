package com.ashpratech.java.model;

import java.util.Date;

import com.ashpratech.java.model.consts.PaymentMethod;

public class Payment {
	private String paymentID;
	private Date paymentDate;
	private PaymentMethod paymentMethod;
	private double amount;
	
	public Payment(String paymentID, Date paymentDate, PaymentMethod paymentMethod, double amount) {
		super();
		this.paymentID = paymentID;
		this.paymentDate = paymentDate;
		this.paymentMethod = paymentMethod;
		this.amount = amount;
	}
	public String getPaymentID() {
		return paymentID;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	public double getAmount() {
		return amount;
	}
	
}
