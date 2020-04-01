package com.practice.example;

public class BuilderDemo {
	public static void main(String args[]) {
		RoomBuilder roomBuilder = new RoomBuilder();

		Fan fan = new Fan("Havells", 1500);
		Tubelight tubelight = new Tubelight("Havells", (byte) 20);
		TV tv = new TV("Sony", "LED");

		Bed bed = new Bed("Velvet", "square");
		
		Room room = roomBuilder
			.addFan(fan)
			.addTubelight(tubelight)
			.addTv(tv)
			.addBed()
				.manufacturesBed(bed)
			.build();

		System.out.println("Room - " + room);
	}
}
