package com.practice.example;

public class BuilderDemo {
	public static void main(String args[]) {
		BedBuilder bedBuilder = new BedBuilder();

		Fan fan = new Fan("Havells", 1500);
		Bed bed = new Bed("Velvet", "square");
		Tubelight tubelight = new Tubelight("Havells", (byte) 20);
		TV tv = new TV("Sony", "LED");

		bedBuilder
			.addFan(fan)
			.addBed(bed)
			.addTubelight(tubelight)
			.addTv(tv);

		Room room = bedBuilder.build();

		System.out.println("Room - " + room);
	}
}
