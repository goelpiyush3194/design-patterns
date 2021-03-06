package com.practice.example;

public class LazySingleton {

	private LazySingleton() {
		System.out.println("LazySingleton is initializing");
	}

	private static LazySingleton lazyInstance;

	// double check locking, better than synchronized method because it locks only
	// if instance is null not every time. But its out-dated, its just a kind of
	// textbook implementation.
	public static LazySingleton getInstance() {
		if (lazyInstance == null) {
			synchronized (LazySingleton.class) {
				if (lazyInstance == null) {
					lazyInstance = new LazySingleton();
				}
			}
		}
		return lazyInstance;
	}
}
