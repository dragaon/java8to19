package com.ashpratech.java.model;

public class Apple {
	private int height;
	private int weight;
	private String color;
	
	public Apple(int height, int weight, String color) {
		super();
		this.height = height;
		this.weight = weight;
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
	@Override
	public String toString() {
		return "Apple [height=" + height + ", weight=" + weight + "]";
	}
}