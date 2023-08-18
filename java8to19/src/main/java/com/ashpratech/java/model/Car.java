package com.ashpratech.java.model;

import com.ashpratech.java.model.consts.BRAND;

public class Car {
	private int weight;
	private BRAND brand;
	public Car(int weight, BRAND brand) {
		super();
		this.weight = weight;
		this.brand = brand;
	}
	public int getWeight() {
		return weight;
	}
	public BRAND getBrand() {
		return brand;
	}
}