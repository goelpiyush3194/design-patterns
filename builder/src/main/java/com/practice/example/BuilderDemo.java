package com.practice.example;

public class BuilderDemo {
	public static void main(String args[]) {
		RoomBuilder roomBuilder = new RoomBuilder();

		Fan fan = new Fan("Havells", 1500);
		Tubelight tubelight = new Tubelight("Havells", (byte) 20);
		TV tv = new TV("Sony", "LED");

		roomBuilder
			.addFan(fan)
			.addTubelight(tubelight)
			.addTv(tv);

		Room room = roomBuilder.build();

		System.out.println("Room - " + room);
	}
}
