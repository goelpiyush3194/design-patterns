package com.practice.example;

public class BuilderDemo {
	public static void main(String args[]) {
		RoomBuilder roomBuilder = new RoomBuilder();
		
		Fan fan = new Fan("Havells", 1500);
		roomBuilder.addFan(fan);
		
		Tubelight tubelight = new Tubelight("Havells", (byte)20);
		roomBuilder.addTubelight(tubelight);
		
		TV tv = new TV("Sony", "LED");		
		roomBuilder.addTv(tv);
		
		Room room = roomBuilder.build();
		
		System.out.println("Room - " + room);
	}
}
