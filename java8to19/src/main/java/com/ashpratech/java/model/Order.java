package com.ashpratech.java.model;

import java.util.Date;
import java.util.List;

import com.ashpratech.java.model.consts.PaymentMethod;

public class Order {
	private String orderID;
	private Date orderDate;
	private double amount;
	private PaymentMethod paymentMethod;
	private Customer customer;
	private List<OrderItem> orderItems;
	
	public Order(String orderID, Date orderDate, double amount, PaymentMethod paymentMethod, Customer customer,
			List<OrderItem> orderItems) {
		super();
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.customer = customer;
		this.orderItems = orderItems;
	}
	public String getOrderID() {
		return orderID;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public double getAmount() {
		return amount;
	}
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	public Customer getCustomer() {
		return customer;
	}
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	
	
}
