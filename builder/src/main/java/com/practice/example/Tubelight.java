package com.practice.example;

public class Tubelight {
	private String brand;
	private byte watt;

	public Tubelight(String brand, byte watt) {
		this.brand = brand;
		this.watt = watt;
	}
	
	@Override
	public String toString() {
		return "Tubelight [brand=" + brand + ", watt=" + watt + "]";
	}
}
