package com.ashpratech.java.config;

import java.util.Date;
import java.util.List;

import com.ashpratech.java.model.Customer;
import com.ashpratech.java.model.Order;
import com.ashpratech.java.model.OrderItem;
import com.ashpratech.java.model.Payment;
import com.ashpratech.java.model.consts.PaymentMethod;

public class OrderConfiguration {
	
	private String customerIDPrefix = "CUST";
	private String orderIDPrefix = "ORD";
	private String orderItemPrefix = "ORDITEM";
	private String paymentPrefix = "PAYMENT";
	
	private int customerID = 1000;
	private int orderID = 1000;
	private int orderItemID = 1000;
	private int paymentID = 1000;
	
	
	public List<Order> getOrders(int count) {
		return null;
	}
	
	public List<Customer> getCustomers(int count){
		return null;
	}

	public Customer getCustomer(String customerID, String firstName, String middleName, String lastName, String city,
			String pinCode, String state, String country) {
		return new Customer(customerID, firstName, middleName, lastName, city, pinCode, state, country);
	}

	public Order getOrder(String orderID, Date orderDate, double amount, PaymentMethod paymentMethod, Customer customer,
			List<OrderItem> orderItems) {
		return new Order(orderID, orderDate, amount, paymentMethod, customer, orderItems);
	}

	public OrderItem getOrderItem(String productName, String productCode, int quantity, double price) {
		return new OrderItem(productName, productCode, quantity, price);	
	}

	public Payment getPayment(String paymentID, Date paymentDate, PaymentMethod paymentMethod, double amount) {
		return new Payment(paymentID, paymentDate, paymentMethod, amount);
	}
}
