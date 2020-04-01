package com.practice.example;

public class Fan {
	private String brand;
	private int sizeInMm;
	
	public Fan(String brand, int sizeInMm) {
		this.brand = brand;
		this.sizeInMm = sizeInMm;
	}

	@Override
	public String toString() {
		return "Fan [brand=" + brand + ", sizeInMm=" + sizeInMm + "]";
	}
	
	
}
