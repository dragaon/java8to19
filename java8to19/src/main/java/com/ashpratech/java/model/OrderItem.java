package com.ashpratech.java.model;

public class OrderItem {
	private String productName;
	private String productCode;
	private int quantity;
	private double price;
	public OrderItem(String productName, String productCode, int quantity, double price) {
		super();
		this.productName = productName;
		this.productCode = productCode;
		this.quantity = quantity;
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public String getProductCode() {
		return productCode;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return price;
	}
	
}
