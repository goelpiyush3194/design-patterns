package com.practice.example;

public class BasicSingleton {

	private BasicSingleton() {
		System.out.println("Singleton is initializing");
	}

	public static BasicSingleton getInstance() {
		return INSTANCE;
	}

	private static final BasicSingleton INSTANCE = new BasicSingleton();

	private int value = 0;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
