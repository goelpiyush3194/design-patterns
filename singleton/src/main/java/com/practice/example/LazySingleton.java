package com.practice.example;

public class LazySingleton {

	private LazySingleton() {
		System.out.println("LazySingleton is initializing");
	}

	private static LazySingleton lazyInstance;

	//synchronized method will be having performance implications
	public static synchronized LazySingleton getInstance() {
		if (lazyInstance == null) {
			lazyInstance = new LazySingleton();
		}
		return lazyInstance;
	}
}
