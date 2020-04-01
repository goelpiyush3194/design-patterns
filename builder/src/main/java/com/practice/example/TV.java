package com.practice.example;

public class TV {
	private String brand;
	private String type;
	
	public TV(String brand, String type) {
		this.brand = brand;
		this.type = type;
	}

	@Override
	public String toString() {
		return "TV [brand=" + brand + ", type=" + type + "]";
	}
}
