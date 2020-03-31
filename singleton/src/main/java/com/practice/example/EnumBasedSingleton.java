package com.practice.example;

public enum EnumBasedSingleton {
	INSTANCE;

	private void doSomething() {

	}
}

class EnumBasedSingletonDemo {

	public static void main(String args[]) throws Exception {
		EnumBasedSingleton enumBasedSingleton1 = EnumBasedSingleton.INSTANCE;
		EnumBasedSingleton enumBasedSingleton2 = EnumBasedSingleton.INSTANCE;
		System.out.println(enumBasedSingleton1 == enumBasedSingleton2);
	}
}
