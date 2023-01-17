package com.ashpratech.java.model.consts;

public enum PaymentMethod {
	CREDIT_CARD("Credit Card", Status.ACTIVE), 
	DEBIT_CARD ("Debit Card", Status.ACTIVE) , 
	CASH_ON_DELIVERY("Cas on Delivery", Status.ACTIVE);
	
	private String name;
	private Status status;
	PaymentMethod(String name, Status status) {
		this.name = name;
		this.status = status;
	}
}
